<template>
  <div>
    <div style="margin-bottom: 15px">
      <el-input v-model="params.stno" style="width: 200px; margin-right: 10px" size="small" placeholder="请输入学生学号"></el-input>
      <el-input v-model="params.name" style="width: 200px; margin-right: 10px" size="small" placeholder="请输入学生姓名"></el-input>
      <el-input v-model="params.warninglevel" style="width: 200px; margin-right: 10px" size="small" placeholder="请输入预警等级"></el-input>
      <el-input v-model="params.learningtime" style="width: 200px; margin-right: 10px" size="small" placeholder="请输入学习时间等级"></el-input>
      <el-input v-model="params.resourcepreference" style="width: 200px; margin-right: 10px" size="small" placeholder="请输入资源偏好等级"></el-input>
      <el-input v-model="params.interaction" style="width: 200px; margin-right: 10px" size="small" placeholder="请输入互动程度等级"></el-input>
      <el-input v-model="params.timepreference" style="width: 200px; margin-right: 10px" size="small" placeholder="请输入学习积极性等级"></el-input>
      <el-input v-model="params.dedication" style="width: 200px; margin-right: 10px" size="small" placeholder="请输入学习认真度等级"></el-input>
      <el-input v-model="params.grades" style="width: 200px; margin-right: 10px" size="small" placeholder="请输入总体成绩等级"></el-input>

      <el-button style="margin-left: 2px" type="success" size="small" @click="findBySearch">
        <i class="el-icon-search"></i>查询
      </el-button>
      <el-button type="warning" size="small" @click="reset">清空</el-button>
    </div>
    <div>
      <el-table :data="tableData" stripe style="width: 100%">
        <el-table-column prop="name" label="姓名" width="180"></el-table-column>
        <el-table-column prop="stno" label="学号" width="200"></el-table-column>
        <el-table-column prop="warninglevel" label="预警等级(1表示最需要预警)"></el-table-column>
        <el-table-column prop="learningtime" label="学习时间(1积极2懈怠3正常)"></el-table-column>
        <el-table-column prop="resourcepreference" label="资源偏好(1无明显2文本3视频)"></el-table-column>
        <el-table-column prop="interaction" label="交互程度(3积极1正常2缺乏)"></el-table-column>
        <el-table-column prop="timepreference" label="学习积极性(1积极思考2按时提交3拖延)"></el-table-column>
        <el-table-column prop="dedication" label="学习认真度(1策略2困惑3独立4依赖)"></el-table-column>
        <el-table-column prop="grades" label="总体成绩(1-5成绩变好)"></el-table-column>
      </el-table>
    </div>
    <div class="block" style="background-color: white">
      <el-pagination
              @size-change="handleSizeChange"
              @current-change="handleCurrentChange"
              :current-page="params.pageNum"
              :page-sizes="[15, 30, 45]"
              :page-size="params.pageSize"
              layout="total, sizes, prev, pager, next, jumper"
              :total="total">
      </el-pagination>
    </div>
  </div>
</template>

<script>
  import request from "@/utils/request";

  export default {
    data() {
      return {
        params:{
          name:'',
          stno:'',
          warninglevel:'',
          learningtime:'',
          resourcepreference:'',
          interaction:'',
          timepreference:'',
          dedication:'',
          grades:'',
          pageNum:1,
          pageSize:15,
        },
        total: 0,
        tableData: []
      }
    },
    //页面加载的时候做的一些事情
    created() {
      this.findBySearch();
    },
    //定义一些页面上控件触发事件调用的方法
    methods: {
      // load() {
      //   request.get("/studentpersona/getWarning").then(res => {
      //     if (res.code === '0') {
      //       this.tableData = res.data;
      //     }else {
      //
      //     }
      //   })
      // },
      findBySearch(){
        request.get("/studentpersona/search",{
          params:this.params
        }).then(res =>{
          if(res.code === '0'){
            this.tableData = res.data.list;
            this.total = res.data.total;

          }else{

          }
        })
      },
      reset(){
        this.params = {
          name:'',
          stno:'',
          warninglevel:'',
          learningtime:'',
          resourcepreference:'',
          interaction:'',
          timepreference:'',
          dedication:'',
          grades:'',
          pageNum:1,
          pageSize:15,

        }
        this.findBySearch();
      },
      handleSizeChange(pageSize){
        this.params.pageSize=pageSize;
        this.findBySearch();
      },
      handleCurrentChange(pageNum){
        this.params.pageNum = pageNum;
        this.findBySearch();
      },

    }
  }
</script>
