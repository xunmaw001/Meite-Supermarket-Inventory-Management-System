<template>
<div class="content">
	<div class="text" :style='{"margin":"50px auto","fontSize":"24px","color":"rgb(51, 51, 51)","textAlign":"center","fontWeight":"bold"}'>欢迎使用 {{this.$project.projectName}}</div>
    <div class="cardView">
        <div class="cards" :style='{"margin":"0 0 20px 0","alignItems":"center","justifyContent":"center","display":"flex"}'>
			<div :style='{"boxShadow":"0 1px 6px rgba(0,0,0,.3)","margin":"0 10px","borderRadius":"40px","display":"flex"}' v-if="isAuth('shangpinxinxi','首页总数')">
				<div :style='{"width":"20px","margin":"20px 10px","borderRadius":"40px","background":"#d5dccc","height":"20px"}'></div>
				<div :style='{"width":"160px","alignItems":"center","flexDirection":"column","justifyContent":"center","display":"flex"}'>
					<div :style='{"margin":"5px 0","lineHeight":"24px","fontSize":"20px","color":"#333","fontWeight":"bold","height":"24px"}'>{{shangpinxinxiCount}}</div>
					<div :style='{"margin":"5px 0","lineHeight":"24px","fontSize":"16px","color":"#666","height":"24px"}'>商品信息总数</div>
				</div>
			</div>
			<div :style='{"boxShadow":"0 1px 6px rgba(0,0,0,.3)","margin":"0 10px","borderRadius":"40px","display":"flex"}' v-if="isAuth('xiaoshouxinxi','首页总数')">
				<div :style='{"width":"20px","margin":"20px 10px","borderRadius":"40px","background":"#d5dccc","height":"20px"}'></div>
				<div :style='{"width":"160px","alignItems":"center","flexDirection":"column","justifyContent":"center","display":"flex"}'>
					<div :style='{"margin":"5px 0","lineHeight":"24px","fontSize":"20px","color":"#333","fontWeight":"bold","height":"24px"}'>{{xiaoshouxinxiCount}}</div>
					<div :style='{"margin":"5px 0","lineHeight":"24px","fontSize":"16px","color":"#666","height":"24px"}'>销售信息总数</div>
				</div>
			</div>
			<div :style='{"boxShadow":"0 1px 6px rgba(0,0,0,.3)","margin":"0 10px","borderRadius":"40px","display":"flex"}' v-if="isAuth('tuihuoruku','首页总数')">
				<div :style='{"width":"20px","margin":"20px 10px","borderRadius":"40px","background":"#d5dccc","height":"20px"}'></div>
				<div :style='{"width":"160px","alignItems":"center","flexDirection":"column","justifyContent":"center","display":"flex"}'>
					<div :style='{"margin":"5px 0","lineHeight":"24px","fontSize":"20px","color":"#333","fontWeight":"bold","height":"24px"}'>{{tuihuorukuCount}}</div>
					<div :style='{"margin":"5px 0","lineHeight":"24px","fontSize":"16px","color":"#666","height":"24px"}'>退货入库总数</div>
				</div>
			</div>
			<div :style='{"boxShadow":"0 1px 6px rgba(0,0,0,.3)","margin":"0 10px","borderRadius":"40px","display":"flex"}' v-if="isAuth('goumaidingdan','首页总数')">
				<div :style='{"width":"20px","margin":"20px 10px","borderRadius":"40px","background":"#d5dccc","height":"20px"}'></div>
				<div :style='{"width":"160px","alignItems":"center","flexDirection":"column","justifyContent":"center","display":"flex"}'>
					<div :style='{"margin":"5px 0","lineHeight":"24px","fontSize":"20px","color":"#333","fontWeight":"bold","height":"24px"}'>{{goumaidingdanCount}}</div>
					<div :style='{"margin":"5px 0","lineHeight":"24px","fontSize":"16px","color":"#666","height":"24px"}'>购买订单总数</div>
				</div>
			</div>
        </div>
        <div style="display: flex;align-items: center;width: 100%;margin-bottom: 10px;">
            <el-card style="width: 25%;margin: 0 10px;" v-if="isAuth('shangpinxinxi','首页统计')">
                <div id="shangpinxinxiChart1" style="width:100%;height:400px;"></div>
            </el-card>
            <el-card style="width: 25%;margin: 0 10px;" v-if="isAuth('xiaoshouxinxi','首页统计')">
                <div id="xiaoshouxinxiChart1" style="width:100%;height:400px;"></div>
            </el-card>
            <el-card style="width: 25%;margin: 0 10px;" v-if="isAuth('tuihuoruku','首页统计')">
                <div id="tuihuorukuChart1" style="width:100%;height:400px;"></div>
            </el-card>
            <el-card style="width: 25%;margin: 0 10px;" v-if="isAuth('goumaidingdan','首页统计')">
                <div id="goumaidingdanChart1" style="width:100%;height:400px;"></div>
            </el-card>
        </div>
    </div>
</div>
</template>
<script>
//4
import router from '@/router/router-static'
import * as echarts from 'echarts'
export default {
	data() {
		return {
            shangpinxinxiCount: 0,
            xiaoshouxinxiCount: 0,
            tuihuorukuCount: 0,
            goumaidingdanCount: 0,
		};
	},
  mounted(){
    this.init();
    this.getshangpinxinxiCount();
    this.shangpinxinxiChat1();
    this.getxiaoshouxinxiCount();
    this.xiaoshouxinxiChat1();
    this.gettuihuorukuCount();
    this.tuihuorukuChat1();
    this.getgoumaidingdanCount();
    this.goumaidingdanChat1();
  },
  methods:{
    init(){
        if(this.$storage.get('Token')){
        this.$http({
            url: `${this.$storage.get('sessionTable')}/session`,
            method: "get"
        }).then(({ data }) => {
            if (data && data.code != 0) {
            router.push({ name: 'login' })
            }
        });
        }else{
            router.push({ name: 'login' })
        }
    },
    getshangpinxinxiCount() {
        this.$http({
            url: `shangpinxinxi/count`,
            method: "get"
        }).then(({
            data
        }) => {
            if (data && data.code == 0) {
                this.shangpinxinxiCount = data.data
            }
        })
    },

    shangpinxinxiChat1() {
      this.$nextTick(()=>{
        // shangpinmingcheng shangpinmingcheng
        //  shuliang

        var shangpinxinxiChart1 = echarts.init(document.getElementById("shangpinxinxiChart1"),'macarons');
        this.$http({
            url: `shangpinxinxi/value/shangpinmingcheng/shuliang`,
            method: "get",
        }).then(({ data }) => {
            if (data && data.code === 0) {
                let res = data.data;
                let xAxis = [];
                let yAxis = [];
                let pArray = []
                for(let i=0;i<res.length;i++){
                    xAxis.push(res[i].shangpinmingcheng);
                    yAxis.push(parseFloat((res[i].total)));
                    pArray.push({
                        value: parseFloat((res[i].total)),
                        name: res[i].shangpinmingcheng
                    })
                }
                var option = {};
                option = {
                    title: {
                        text: '商品库存统计',
                        left: 'center'
                    },
                    tooltip: {
                      trigger: 'item',
                      formatter: '{b} : {c}'
                    },
                    xAxis: {
                        type: 'category',
                        data: xAxis
                    },
                    yAxis: {
                        type: 'value'
                    },
                    series: [{
                        data: yAxis,
                        type: 'bar'
                    }]
                };
                // 使用刚指定的配置项和数据显示图表。
                shangpinxinxiChart1.setOption(option);
                  //根据窗口的大小变动图表
                window.onresize = function() {
                    shangpinxinxiChart1.resize();
                };
            }
        });
      })
    },






    getxiaoshouxinxiCount() {
        this.$http({
            url: `xiaoshouxinxi/count`,
            method: "get"
        }).then(({
            data
        }) => {
            if (data && data.code == 0) {
                this.xiaoshouxinxiCount = data.data
            }
        })
    },

    xiaoshouxinxiChat1() {
      this.$nextTick(()=>{
        // shangpinmingcheng shangpinmingcheng
        //  xiaoshoujine

        var xiaoshouxinxiChart1 = echarts.init(document.getElementById("xiaoshouxinxiChart1"),'macarons');
        this.$http({
            url: `xiaoshouxinxi/value/shangpinmingcheng/xiaoshoujine`,
            method: "get",
        }).then(({ data }) => {
            if (data && data.code === 0) {
                let res = data.data;
                let xAxis = [];
                let yAxis = [];
                let pArray = []
                for(let i=0;i<res.length;i++){
                    xAxis.push(res[i].shangpinmingcheng);
                    yAxis.push(parseFloat((res[i].total)));
                    pArray.push({
                        value: parseFloat((res[i].total)),
                        name: res[i].shangpinmingcheng
                    })
                }
                var option = {};
                option = {
                    title: {
                        text: '商品销售统计',
                        left: 'center'
                    },
                    tooltip: {
                      trigger: 'item',
                      formatter: '{b} : {c}'
                    },
                    xAxis: {
                        type: 'category',
                        boundaryGap: false,
                        data: xAxis
                    },
                    yAxis: {
                        type: 'value'
                    },
                    series: [{
                        data: yAxis,
                        type: 'line',
                        smooth: true
                    }]
                };
                // 使用刚指定的配置项和数据显示图表。
                xiaoshouxinxiChart1.setOption(option);
                  //根据窗口的大小变动图表
                window.onresize = function() {
                    xiaoshouxinxiChart1.resize();
                };
            }
        });
      })
    },






    gettuihuorukuCount() {
        this.$http({
            url: `tuihuoruku/count`,
            method: "get"
        }).then(({
            data
        }) => {
            if (data && data.code == 0) {
                this.tuihuorukuCount = data.data
            }
        })
    },

    tuihuorukuChat1() {
      this.$nextTick(()=>{
        // shangpinmingcheng shangpinmingcheng
        //  shuliang

        var tuihuorukuChart1 = echarts.init(document.getElementById("tuihuorukuChart1"),'macarons');
        this.$http({
            url: `tuihuoruku/value/shangpinmingcheng/shuliang`,
            method: "get",
        }).then(({ data }) => {
            if (data && data.code === 0) {
                let res = data.data;
                let xAxis = [];
                let yAxis = [];
                let pArray = []
                for(let i=0;i<res.length;i++){
                    xAxis.push(res[i].shangpinmingcheng);
                    yAxis.push(parseFloat((res[i].total)));
                    pArray.push({
                        value: parseFloat((res[i].total)),
                        name: res[i].shangpinmingcheng
                    })
                }
                var option = {};
                option = {
                    title: {
                        text: '退货数量统计',
                        left: 'center'
                    },
                    tooltip: {
                      trigger: 'item',
                      formatter: '{b} : {c}'
                    },
                    xAxis: {
                        type: 'category',
                        data: xAxis
                    },
                    yAxis: {
                        type: 'value'
                    },
                    series: [{
                        data: yAxis,
                        type: 'bar'
                    }]
                };
                // 使用刚指定的配置项和数据显示图表。
                tuihuorukuChart1.setOption(option);
                  //根据窗口的大小变动图表
                window.onresize = function() {
                    tuihuorukuChart1.resize();
                };
            }
        });
      })
    },






    getgoumaidingdanCount() {
        this.$http({
            url: `goumaidingdan/count`,
            method: "get"
        }).then(({
            data
        }) => {
            if (data && data.code == 0) {
                this.goumaidingdanCount = data.data
            }
        })
    },

    goumaidingdanChat1() {
      this.$nextTick(()=>{
        // shangpinmingcheng shangpinmingcheng
        //  jine

        var goumaidingdanChart1 = echarts.init(document.getElementById("goumaidingdanChart1"),'macarons');
        this.$http({
            url: `goumaidingdan/value/shangpinmingcheng/jine`,
            method: "get",
        }).then(({ data }) => {
            if (data && data.code === 0) {
                let res = data.data;
                let xAxis = [];
                let yAxis = [];
                let pArray = []
                for(let i=0;i<res.length;i++){
                    xAxis.push(res[i].shangpinmingcheng);
                    yAxis.push(parseFloat((res[i].total)));
                    pArray.push({
                        value: parseFloat((res[i].total)),
                        name: res[i].shangpinmingcheng
                    })
                }
                var option = {};
                option = {
                    title: {
                        text: '商品购买统计',
                        left: 'center'
                    },
                    tooltip: {
                      trigger: 'item',
                      formatter: '{b} : {c}'
                    },
                    xAxis: {
                        type: 'value'
                    },
                    yAxis: {
                        type: 'category',
                        data: xAxis
                    },
                    series: [{
                        data: yAxis,
                        type: 'bar'
                    }]
                };
                // 使用刚指定的配置项和数据显示图表。
                goumaidingdanChart1.setOption(option);
                  //根据窗口的大小变动图表
                window.onresize = function() {
                    goumaidingdanChart1.resize();
                };
            }
        });
      })
    },






  }
};
</script>
<style lang="scss" scoped>
    .cardView {
        display: flex;
        flex-wrap: wrap;
        width: 100%;

        .cards {
            display: flex;
            align-items: center;
            width: 100%;
            margin-bottom: 10px;
            justify-content: center;
            .card {
                width: calc(25% - 20px);
                margin: 0 10px;
                /deep/.el-card__body{
                    padding: 0;
                }
            }
        }
    }
</style>
