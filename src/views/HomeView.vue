<template>
  <div>
    <div style="background-color: white;box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);border: 1px solid #ddd;border-radius: 5px;padding: 30px;">
      <div style="font-weight: bold; font-size: 30px; text-align: center; margin-bottom: 30px">学习者整体画像</div>
      <el-row>
        <el-col :span="8">
          <div>
            <div id="pie" style="height: 400px">

            </div>
          </div>
        </el-col>
        <el-col :span="8">
          <div>
            <div id="pie2" style="height: 400px">

            </div>
          </div>
        </el-col>
        <el-col :span="8">
          <div>
            <div id="pie3" style="height: 400px">

            </div>
          </div>
        </el-col>
      </el-row>
      <el-row>
        <el-col :span="8">
          <div>
            <div id="pie4" style="height: 400px">

            </div>
          </div>
        </el-col>
        <el-col :span="8">
          <div>
            <div id="pie5" style="height: 400px">

            </div>
          </div>
        </el-col>
        <el-col :span="8">
          <div>
            <div id="pie6" style="height: 400px">

            </div>
          </div>
        </el-col>
      </el-row>
    </div>

  </div>
</template>

<script>
import * as echarts from "echarts";
import request from "@/utils/request";

  export default {
    name: 'HomeView',
    data() {
      return {
        data:[],
        data2:[],
        data3:[],
        data4:[],
        data5:[],
        data6:[],
      }
    },

    mounted() {
      this.initEcharts()
      this.initEcharts2()
      this.initEcharts3()
      this.initEcharts4()
      this.initEcharts5()
      this.initEcharts6()
    },
    // 定义一些页面上控件出发的事件调用的方法
    methods: {
      initEcharts(){
        request.get("/studentpersona/echarts/pie").then(res => {
          if(res.code === '0'){
            this.initPie(res.data)
          }else{
            this.$message.error(res.msg)
          }
        })
      },

      initPie(data){
        let chartDom = document.getElementById('pie');
        let myChart = echarts.init(chartDom);
        let option;

        option = {
          title: {
            text: '学习时间',
            left: 'center'
          },
          tooltip: {
            trigger: 'item'
          },
          legend: {
            orient: 'vertical',
            left: 'left'
          },
          series: [
            {
              name: '人数',
              type: 'pie',
              radius: '50%',
              data: data,
              emphasis: {
                itemStyle: {
                  shadowBlur: 10,
                  shadowOffsetX: 0,
                  shadowColor: 'rgba(0, 0, 0, 0.5)'
                }
              }
            }
          ]
        };

        option && myChart.setOption(option);

      },

      initEcharts2(){
        request.get("/studentpersona/echarts/pie2").then(res => {
          if(res.code === '0'){
            this.initPie2(res.data)
          }else{
            this.$message.error(res.msg)
          }
        })
      },

      initPie2(data){
        let chartDom = document.getElementById('pie2');
        let myChart = echarts.init(chartDom);
        let option;

        option = {
          title: {
            text: '资源偏好',
            left: 'center'
          },
          tooltip: {
            trigger: 'item'
          },
          legend: {
            orient: 'vertical',
            left: 'left'
          },
          series: [
            {
              name: '人数',
              type: 'pie',
              radius: '50%',
              data: data,
              emphasis: {
                itemStyle: {
                  shadowBlur: 10,
                  shadowOffsetX: 0,
                  shadowColor: 'rgba(0, 0, 0, 0.5)'
                }
              }
            }
          ]
        };

        option && myChart.setOption(option);

      },

      initEcharts3(){
        request.get("/studentpersona/echarts/pie3").then(res => {
          if(res.code === '0'){
            this.initPie3(res.data)
          }else{
            this.$message.error(res.msg)
          }
        })
      },

      initPie3(data){
        let chartDom = document.getElementById('pie3');
        let myChart = echarts.init(chartDom);
        let option;

        option = {
          title: {
            text: '互动程度',
            left: 'center'
          },
          tooltip: {
            trigger: 'item'
          },
          legend: {
            orient: 'vertical',
            left: 'left'
          },
          series: [
            {
              name: '人数',
              type: 'pie',
              radius: '50%',
              data: data,
              emphasis: {
                itemStyle: {
                  shadowBlur: 10,
                  shadowOffsetX: 0,
                  shadowColor: 'rgba(0, 0, 0, 0.5)'
                }
              }
            }
          ]
        };

        option && myChart.setOption(option);

      },

      initEcharts4(){
        request.get("/studentpersona/echarts/pie4").then(res => {
          if(res.code === '0'){
            this.initPie4(res.data)
          }else{
            this.$message.error(res.msg)
          }
        })
      },

      initPie4(data){
        let chartDom = document.getElementById('pie4');
        let myChart = echarts.init(chartDom);
        let option;

        option = {
          title: {
            text: '学习积极性',
            left: 'center'
          },
          tooltip: {
            trigger: 'item'
          },
          legend: {
            orient: 'vertical',
            left: 'left'
          },
          series: [
            {
              name: '人数',
              type: 'pie',
              radius: '50%',
              data: data,
              emphasis: {
                itemStyle: {
                  shadowBlur: 10,
                  shadowOffsetX: 0,
                  shadowColor: 'rgba(0, 0, 0, 0.5)'
                }
              }
            }
          ]
        };

        option && myChart.setOption(option);

      },

      initEcharts5(){
        request.get("/studentpersona/echarts/pie5").then(res => {
          if(res.code === '0'){
            this.initPie5(res.data)
          }else{
            this.$message.error(res.msg)
          }
        })
      },

      initPie5(data){
        let chartDom = document.getElementById('pie5');
        let myChart = echarts.init(chartDom);
        let option;

        option = {
          title: {
            text: '学习认真度',
            left: 'center'
          },
          tooltip: {
            trigger: 'item'
          },
          legend: {
            orient: 'vertical',
            left: 'left'
          },
          series: [
            {
              name: '人数',
              type: 'pie',
              radius: '50%',
              data: data,
              emphasis: {
                itemStyle: {
                  shadowBlur: 10,
                  shadowOffsetX: 0,
                  shadowColor: 'rgba(0, 0, 0, 0.5)'
                }
              }
            }
          ]
        };

        option && myChart.setOption(option);

      },

      initEcharts6(){
        request.get("/studentpersona/echarts/pie6").then(res => {
          if(res.code === '0'){
            this.initPie6(res.data)
          }else{
            this.$message.error(res.msg)
          }
        })
      },

      initPie6(data){
        let chartDom = document.getElementById('pie6');
        let myChart = echarts.init(chartDom);
        let option;

        option = {
          title: {
            text: '总体成绩',
            left: 'center'
          },
          tooltip: {
            trigger: 'item'
          },
          legend: {
            orient: 'vertical',
            left: 'left'
          },
          series: [
            {
              name: '人数',
              type: 'pie',
              radius: '50%',
              data: data,
              emphasis: {
                itemStyle: {
                  shadowBlur: 10,
                  shadowOffsetX: 0,
                  shadowColor: 'rgba(0, 0, 0, 0.5)'
                }
              }
            }
          ]
        };

        option && myChart.setOption(option);

      },
    }
  }
</script>

<style>
.el-row {
  margin-bottom: 20px;
  &:last-child {
    margin-bottom: 0;
  }
}
</style>