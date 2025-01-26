import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Messages from '../pages/messages/list'
import Forum from '../pages/forum/list'
import ForumAdd from '../pages/forum/add'
import ForumDetail from '../pages/forum/detail'
import MyForumList from '../pages/forum/myForumList'
import Storeup from '../pages/storeup/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import yonghuList from '../pages/yonghu/list'
import yonghuDetail from '../pages/yonghu/detail'
import yonghuAdd from '../pages/yonghu/add'
import shangpinfenleiList from '../pages/shangpinfenlei/list'
import shangpinfenleiDetail from '../pages/shangpinfenlei/detail'
import shangpinfenleiAdd from '../pages/shangpinfenlei/add'
import gongyingshangList from '../pages/gongyingshang/list'
import gongyingshangDetail from '../pages/gongyingshang/detail'
import gongyingshangAdd from '../pages/gongyingshang/add'
import shangpinxinxiList from '../pages/shangpinxinxi/list'
import shangpinxinxiDetail from '../pages/shangpinxinxi/detail'
import shangpinxinxiAdd from '../pages/shangpinxinxi/add'
import caigourukuList from '../pages/caigouruku/list'
import caigourukuDetail from '../pages/caigouruku/detail'
import caigourukuAdd from '../pages/caigouruku/add'
import xiaoshouxinxiList from '../pages/xiaoshouxinxi/list'
import xiaoshouxinxiDetail from '../pages/xiaoshouxinxi/detail'
import xiaoshouxinxiAdd from '../pages/xiaoshouxinxi/add'
import zengpinrukuList from '../pages/zengpinruku/list'
import zengpinrukuDetail from '../pages/zengpinruku/detail'
import zengpinrukuAdd from '../pages/zengpinruku/add'
import tuihuorukuList from '../pages/tuihuoruku/list'
import tuihuorukuDetail from '../pages/tuihuoruku/detail'
import tuihuorukuAdd from '../pages/tuihuoruku/add'
import qitarukuList from '../pages/qitaruku/list'
import qitarukuDetail from '../pages/qitaruku/detail'
import qitarukuAdd from '../pages/qitaruku/add'
import goumaidingdanList from '../pages/goumaidingdan/list'
import goumaidingdanDetail from '../pages/goumaidingdan/detail'
import goumaidingdanAdd from '../pages/goumaidingdan/add'
import zengsongxinxiList from '../pages/zengsongxinxi/list'
import zengsongxinxiDetail from '../pages/zengsongxinxi/detail'
import zengsongxinxiAdd from '../pages/zengsongxinxi/add'
import pandianxinxiList from '../pages/pandianxinxi/list'
import pandianxinxiDetail from '../pages/pandianxinxi/detail'
import pandianxinxiAdd from '../pages/pandianxinxi/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'messages',
					component: Messages
				},
				{
					path: 'forum',
					component: Forum
				},
				{
					path: 'forumAdd',
					component: ForumAdd
				},
				{
					path: 'forumDetail',
					component: ForumDetail
				},
				{
					path: 'myForumList',
					component: MyForumList
				},
				{
					path: 'storeup',
					component: Storeup
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'yonghu',
					component: yonghuList
				},
				{
					path: 'yonghuDetail',
					component: yonghuDetail
				},
				{
					path: 'yonghuAdd',
					component: yonghuAdd
				},
				{
					path: 'shangpinfenlei',
					component: shangpinfenleiList
				},
				{
					path: 'shangpinfenleiDetail',
					component: shangpinfenleiDetail
				},
				{
					path: 'shangpinfenleiAdd',
					component: shangpinfenleiAdd
				},
				{
					path: 'gongyingshang',
					component: gongyingshangList
				},
				{
					path: 'gongyingshangDetail',
					component: gongyingshangDetail
				},
				{
					path: 'gongyingshangAdd',
					component: gongyingshangAdd
				},
				{
					path: 'shangpinxinxi',
					component: shangpinxinxiList
				},
				{
					path: 'shangpinxinxiDetail',
					component: shangpinxinxiDetail
				},
				{
					path: 'shangpinxinxiAdd',
					component: shangpinxinxiAdd
				},
				{
					path: 'caigouruku',
					component: caigourukuList
				},
				{
					path: 'caigourukuDetail',
					component: caigourukuDetail
				},
				{
					path: 'caigourukuAdd',
					component: caigourukuAdd
				},
				{
					path: 'xiaoshouxinxi',
					component: xiaoshouxinxiList
				},
				{
					path: 'xiaoshouxinxiDetail',
					component: xiaoshouxinxiDetail
				},
				{
					path: 'xiaoshouxinxiAdd',
					component: xiaoshouxinxiAdd
				},
				{
					path: 'zengpinruku',
					component: zengpinrukuList
				},
				{
					path: 'zengpinrukuDetail',
					component: zengpinrukuDetail
				},
				{
					path: 'zengpinrukuAdd',
					component: zengpinrukuAdd
				},
				{
					path: 'tuihuoruku',
					component: tuihuorukuList
				},
				{
					path: 'tuihuorukuDetail',
					component: tuihuorukuDetail
				},
				{
					path: 'tuihuorukuAdd',
					component: tuihuorukuAdd
				},
				{
					path: 'qitaruku',
					component: qitarukuList
				},
				{
					path: 'qitarukuDetail',
					component: qitarukuDetail
				},
				{
					path: 'qitarukuAdd',
					component: qitarukuAdd
				},
				{
					path: 'goumaidingdan',
					component: goumaidingdanList
				},
				{
					path: 'goumaidingdanDetail',
					component: goumaidingdanDetail
				},
				{
					path: 'goumaidingdanAdd',
					component: goumaidingdanAdd
				},
				{
					path: 'zengsongxinxi',
					component: zengsongxinxiList
				},
				{
					path: 'zengsongxinxiDetail',
					component: zengsongxinxiDetail
				},
				{
					path: 'zengsongxinxiAdd',
					component: zengsongxinxiAdd
				},
				{
					path: 'pandianxinxi',
					component: pandianxinxiList
				},
				{
					path: 'pandianxinxiDetail',
					component: pandianxinxiDetail
				},
				{
					path: 'pandianxinxiAdd',
					component: pandianxinxiAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
