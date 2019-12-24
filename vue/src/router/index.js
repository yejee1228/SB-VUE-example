import Vue from 'vue'
import Router from 'vue-router'
//import Bauman from '@/components/Bauman.vue'
import Join from '@/components/Join.vue'
Vue.use(Router)
export default new Router({
	mode : "history",
	routes: [
		//{path: '/bauman', name: 'bauman', component: Bauman},
		{path: '/', name: 'join', component: Join}
	]

})