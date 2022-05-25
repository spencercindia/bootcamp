import Vue from 'vue';
import VueRouter from 'vue-router';
import Home from '../views/Home';
import MyBooks from '../views/MyBooks'

Vue.use(VueRouter);

const routes = [
  {
    path: '/',
    name: 'home',
    component: Home
  },
  {
    path: '/myBooks',
    name: 'myBooks',
    component: MyBooks
  }
];

const router = new VueRouter({
  mode: 'history',
  routes
});

export default router;
