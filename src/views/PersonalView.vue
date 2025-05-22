<template>
  <div>
    <div style="background-color: white;box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);border: 1px solid #ddd;border-radius: 5px;padding: 30px;">
      <div style="font-weight: bold; font-size: 30px; text-align: center; margin-bottom: 30px">学习者个人画像</div>
      <div style="margin-bottom: 20px">
        <el-input v-model="input" style="width: 200px; margin-right: 10px" size="small" placeholder="请输入学生学号"></el-input>
        <el-input v-model="input" style="width: 200px; margin-right: 10px" size="small" placeholder="请输入学生姓名"></el-input>

        <el-button style="margin-left: 2px" type="success" size="small" @click="findBySearch">
          <i class="el-icon-search"></i>查询
        </el-button>
      </div>
      <el-container>
        <div style="width: 50%">
          <div id="radar" style="width: 100%;height: 400px">

          </div>
        </div>
        <div style="width: 50%;">
          <div style="width: 100%;height: 400px; border: 1px solid #ddd;border-radius: 5px;">
            <div style="width: 100%;height: 40px;background-color:#0E932E">
              <div style="font-weight: bold; font-size: 25px; text-align:center; color: white;">学习者个人评价</div>
              <div style="margin-top: 30px;margin-left: 30px">
                属于优秀型学习者
              </div>
              <div style="margin-top: 30px;margin-left: 30px">
                交互程度 学习积极性需要提高
              </div>
            </div>

          </div>
        </div>
      </el-container>

    </div>

  </div>
</template>

<script lang="ts">
  import * as echarts from 'echarts';


  export default {
    data() {
      return {
        input: ''
      }
    },

    mounted() {
      this.initRadar()
    },
    // 定义一些页面上控件出发的事件调用的方法
    methods: {
      // initEcharts(){
      //   request.get("/studentpersona/echarts/radar").then(res => {
      //     if(res.code === '0'){
      //       this.initPie(res.data)
      //     }else{
      //       this.$message.error(res.msg)
      //     }
      //   })
      // },

      initRadar(){
        let chartDom = document.getElementById('radar');
        let myChart = echarts.init(chartDom);
        let option;

        option = {
          title: {
            text: '张XX',
          },
          legend: {
            data: ['学习者个人画像', '标签值']
          },
          radar: {
            // shape: 'circle',
            indicator: [
              { name: '学习时间', max: 3 },
              { name: '资源偏好', max: 3 },
              { name: '互动程度', max: 3 },
              { name: '学习积极性', max: 3 },
              { name: '学习认真度', max: 4 },
              { name: '总体成绩', max: 5 }
            ]
          },
          series: [
            {
              name: 'Budget vs spending',
              type: 'radar',
              data: [
                {
                  value: [3, 2, 1, 1, 3, 3],
                  name: '学习者个人画像'
                }
              ]
            }
          ]
        };
        option && myChart.setOption(option);
      },
    }
  }
</script>
       