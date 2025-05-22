import Vue from 'vue'
import VueRouter from 'vue-router'
import LoginView from '@/views/LoginView.vue'
import Layout from '@/views/Layout.vue';
import CourseSelectView from "@/views/CourseSelectView.vue";

Vue.use(VueRouter)

const routes = [
  {
    path: '/login',
    name: 'login',
    component: LoginView
  },
  {
    path: '/',
    name: 'Layout',
    component: Layout,
    redirect:'/group',
    children:[
      {
        path: '/group',
        name: 'Group',
        component: () => import(/* webpackChunkName: "about" */ '../views/HomeView.vue')
      },
      {
        path: 'personal',
        name: 'Personal',
        component: () => import(/* webpackChunkName: "about" */ '../views/PersonalView.vue')
      },
      {
        path: 'warning',
        name: 'Warning',
        component: () => import(/* webpackChunkName: "about" */ '../views/WarningView.vue')
      }
    ]
  },

]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
