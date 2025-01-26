export function isAuth(tableName, key) {
  let role = localStorage.getItem("UserTableName");
  let menus = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["新增","查看","修改","删除"],"menu":"商品分类","menuJump":"列表","tableName":"shangpinfenlei"}],"menu":"商品分类管理"},{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["新增","查看","修改","删除"],"menu":"供应商","menuJump":"列表","tableName":"gongyingshang"}],"menu":"供应商管理"},{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["新增","查看","修改","删除","商品库存统计","导出","首页总数","首页统计","采购入库","销售","赠品入库","退货入库","其它入库","赠送","盘点"],"menu":"商品信息","menuJump":"列表","tableName":"shangpinxinxi"}],"menu":"商品信息管理"},{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["查看","修改","删除","采购数量统计"],"menu":"采购入库","menuJump":"列表","tableName":"caigouruku"}],"menu":"采购入库管理"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["查看","修改","删除","商品销售统计","首页总数","首页统计"],"menu":"销售信息","menuJump":"列表","tableName":"xiaoshouxinxi"}],"menu":"销售信息管理"},{"child":[{"appFrontIcon":"cuIcon-flashlightopen","buttons":["查看","修改","删除","赠品入库统计"],"menu":"赠品入库","menuJump":"列表","tableName":"zengpinruku"}],"menu":"赠品入库管理"},{"child":[{"appFrontIcon":"cuIcon-vip","buttons":["查看","修改","删除","退货数量统计","首页总数","首页统计"],"menu":"退货入库","menuJump":"列表","tableName":"tuihuoruku"}],"menu":"退货入库管理"},{"child":[{"appFrontIcon":"cuIcon-form","buttons":["查看","修改","删除","其它入库统计"],"menu":"其它入库","menuJump":"列表","tableName":"qitaruku"}],"menu":"其它入库管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["查看","修改","删除","商品购买统计","首页总数","首页统计"],"menu":"购买订单","menuJump":"列表","tableName":"goumaidingdan"}],"menu":"购买订单管理"},{"child":[{"appFrontIcon":"cuIcon-form","buttons":["查看","修改","删除","赠送数量统计"],"menu":"赠送信息","menuJump":"列表","tableName":"zengsongxinxi"}],"menu":"赠送信息管理"},{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["查看","修改","删除","导出"],"menu":"盘点信息","menuJump":"列表","tableName":"pandianxinxi"}],"menu":"盘点信息管理"},{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["查看","回复","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["删除","查看"],"menu":"论坛管理","tableName":"forum"}],"menu":"论坛管理"},{"child":[{"appFrontIcon":"cuIcon-full","buttons":["查看","修改"],"menu":"轮播图管理","tableName":"config"},{"appFrontIcon":"cuIcon-clothes","buttons":["查看","修改"],"menu":"系统简介","tableName":"systemintro"},{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"公告信息","tableName":"news"},{"appFrontIcon":"cuIcon-skin","buttons":["查看","修改"],"menu":"关于我们","tableName":"aboutus"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看","购买"],"menu":"商品信息列表","menuJump":"列表","tableName":"shangpinxinxi"}],"menu":"商品信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-news","buttons":["查看","修改","删除","支付"],"menu":"购买订单","menuJump":"列表","tableName":"goumaidingdan"}],"menu":"购买订单管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看","购买"],"menu":"商品信息列表","menuJump":"列表","tableName":"shangpinxinxi"}],"menu":"商品信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}];
  for(let i=0;i<menus.length;i++){
    if(menus[i].tableName==role){
      for(let j=0;j<menus[i].frontMenu.length;j++){
          for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
            if(tableName==menus[i].frontMenu[j].child[k].tableName){
              let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
              return buttons.indexOf(key) !== -1 || false
            }
          }
      }
    }
  }
  return false;
}

/**
 *  * 获取当前时间（yyyy-MM-dd hh:mm:ss）
 *   */
export function getCurDateTime() {
    let currentTime = new Date(),
    year = currentTime.getFullYear(),
    month = currentTime.getMonth() + 1 < 10 ? '0' + (currentTime.getMonth() + 1) : currentTime.getMonth() + 1,
    day = currentTime.getDate() < 10 ? '0' + currentTime.getDate() : currentTime.getDate(),
    hour = currentTime.getHours(),
    minute = currentTime.getMinutes(),
    second = currentTime.getSeconds();
    return year + "-" + month + "-" + day + " " +hour +":" +minute+":"+second;
}

/**
 *  * 获取当前日期（yyyy-MM-dd）
 *   */
export function getCurDate() {
    let currentTime = new Date(),
    year = currentTime.getFullYear(),
    month = currentTime.getMonth() + 1 < 10 ? '0' + (currentTime.getMonth() + 1) : currentTime.getMonth() + 1,
    day = currentTime.getDate() < 10 ? '0' + currentTime.getDate() : currentTime.getDate();
    return year + "-" + month + "-" + day;
}
