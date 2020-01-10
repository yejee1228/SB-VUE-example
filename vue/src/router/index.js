import Vue from 'vue'
import Router from 'vue-router'
import Join from '@/components/Join.vue'
import Login from '@/components/Login.vue'
import Mypage from '@/components/Mypage.vue'
import MypageModify from '@/components/MypageModify.vue'
import MypageModifyCheck from '@/components/MypageModifyCheck.vue'
import Sns from '@/components/SnsPage.vue'
import SnsDetail from '@/components/SnsDetail.vue'
Vue.use(Router)
export default new Router({
	mode : "history",
	routes: [
		{path: '/join', name: 'join', component: Join},
		{path: '/login', name: 'login', component: Login},
		{path: '/mypage', name: 'mypage', component: Mypage},
		{path: '/mypagemodifycheck', name: 'mypagemodifycheck', component: MypageModifyCheck},
		{path: '/mypagemodify', name: 'mypagemodify', component: MypageModify},
		{path: '/sns', name: 'sns', component: Sns},
		{path: '/snsdetail', name: 'snsdetail', component: SnsDetail},
	]

})