<template>
  <div>
    <el-container>
      <el-header style="background-color: #ffffff">
        <img src="@/assets/logo.png" alt="" style="width: 40px; position: relative; top: 10px;">
        <span style="font-size: 20px; margin-left: 15px; color: #4f4f4f">学习者画像系统</span>
        <el-dropdown style="float: right; height: 60px; line-height: 60px">
          <span class="el-dropdown-link" style="color: #4f4f4f; font-size: 16px">{{ user.name }}<i class="el-icon-arrow-down el-icon--right"></i></span>
          <el-dropdown-menu slot="dropdown">
            <el-dropdown-item>
              <div @click="logout">退出登录</div>
            </el-dropdown-item>
          </el-dropdown-menu>
        </el-dropdown>
      </el-header>
    </el-container>

    <el-container>
      <el-aside style="overflow: hidden; min-height: 100vh; background-color: #ffffff; width: 250px">
        <el-menu :default-active="$route.path" router background-color="#FFFFFF" text-color="#4f4f4f" active-text-color="#0E932E">
          <el-submenu index="1">
            <template slot="title">
              <i class="el-icon-s-data"></i><span>学习者画像</span>
            </template>
            <el-menu-item-group>
              <el-menu-item index="/group">
                <i class="el-icon-pie-chart"></i>
                <span>群体画像</span>
              </el-menu-item>
              <el-menu-item index="/personal">
                <i class="el-icon-s-custom"></i>
                <span>个人画像</span>
              </el-menu-item>
            </el-menu-item-group>
          </el-submenu>
          <el-menu-item index="/warning">
            <i class="el-icon-warning"></i>
            <span slot="title">学情预警</span>
          </el-menu-item>
          <el-menu-item index="/login">
            <i class="el-icon-switch-button"></i>
            <span slot="title">退出系统</span>
          </el-menu-item>
        </el-menu>
      </el-aside>
      <el-main style="background-color: #EFEFEF">
        <router-view/>
      </el-main>
    </el-container>
  </div>
</template>

<style>
.el-menu{
  border-right: none !important;
}
</style>

<script>
export default {
  name: "Layout",
  data(){
    return{
      user: localStorage.getItem("user")? JSON.parse(localStorage.getItem("user")):{}
    }
  },

  methods:{
    logout(){
      localStorage.removeItem("user");
      this.$router.push("/login");
    }
  }
}
</script>