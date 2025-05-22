const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true,
  // devServer: {
  //   open:true,
  //   port: 8082,
  //   proxy: {    //设置代理，必须填
  //     '/proxy': {   //设置拦截器  拦截器格式：斜杠+拦截器名
  //       target: 'http://localhost:8082',   //代理的目标地址
  //       changeOrigin: true,     //是否设置同源，输入是的
  //       pathRewrite: {     //路径重写
  //         '^/proxy': '' //选择忽略拦截器里面的内容
  //       }
  //     }
  //   }
  // }
})
let proxyObj = {};

// proxyObj['/'] = {
//   //websocket
//   ws: false,
//   //目标地址
//   target: 'http://localhost:8082',
//   //发送请求头中host会设置成target
//   changeOrigin: true,
//   //不重写请求地址
//   pathRewrite: {
//     '^/': '/'
//   }
// };
//
// // websocket的代理
//
// proxyObj['/ws'] = {
//   ws: true,
//   target: 'ws://localhost:8082'
// };
//
// module.exports = {
//   devServer: {
//     host: 'localhost',
//     port: 8082,
//     proxy: proxyObj
//   },
//   configureWebpack: {
//     devtool: 'source-map'
//   }
// };