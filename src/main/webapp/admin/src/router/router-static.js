import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import aboutus from '@/views/modules/aboutus/list'
    import gongyingshang from '@/views/modules/gongyingshang/list'
    import qitaruku from '@/views/modules/qitaruku/list'
    import zengsongxinxi from '@/views/modules/zengsongxinxi/list'
    import goumaidingdan from '@/views/modules/goumaidingdan/list'
    import shangpinxinxi from '@/views/modules/shangpinxinxi/list'
    import caigouruku from '@/views/modules/caigouruku/list'
    import tuihuoruku from '@/views/modules/tuihuoruku/list'
    import forum from '@/views/modules/forum/list'
    import xiaoshouxinxi from '@/views/modules/xiaoshouxinxi/list'
    import systemintro from '@/views/modules/systemintro/list'
    import yonghu from '@/views/modules/yonghu/list'
    import shangpinfenlei from '@/views/modules/shangpinfenlei/list'
    import messages from '@/views/modules/messages/list'
    import zengpinruku from '@/views/modules/zengpinruku/list'
    import pandianxinxi from '@/views/modules/pandianxinxi/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '系统首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '系统首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '公告信息',
        component: news
      }
      ,{
	path: '/aboutus',
        name: '关于我们',
        component: aboutus
      }
      ,{
	path: '/gongyingshang',
        name: '供应商',
        component: gongyingshang
      }
      ,{
	path: '/qitaruku',
        name: '其它入库',
        component: qitaruku
      }
      ,{
	path: '/zengsongxinxi',
        name: '赠送信息',
        component: zengsongxinxi
      }
      ,{
	path: '/goumaidingdan',
        name: '购买订单',
        component: goumaidingdan
      }
      ,{
	path: '/shangpinxinxi',
        name: '商品信息',
        component: shangpinxinxi
      }
      ,{
	path: '/caigouruku',
        name: '采购入库',
        component: caigouruku
      }
      ,{
	path: '/tuihuoruku',
        name: '退货入库',
        component: tuihuoruku
      }
      ,{
	path: '/forum',
        name: '论坛管理',
        component: forum
      }
      ,{
	path: '/xiaoshouxinxi',
        name: '销售信息',
        component: xiaoshouxinxi
      }
      ,{
	path: '/systemintro',
        name: '系统简介',
        component: systemintro
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/shangpinfenlei',
        name: '商品分类',
        component: shangpinfenlei
      }
      ,{
	path: '/messages',
        name: '留言板管理',
        component: messages
      }
      ,{
	path: '/zengpinruku',
        name: '赠品入库',
        component: zengpinruku
      }
      ,{
	path: '/pandianxinxi',
        name: '盘点信息',
        component: pandianxinxi
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '系统首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
