<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"></c:set>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>unique</title>
<link type="text/css" href="${contextPath}/assets/css/css.css" rel="stylesheet" />
<script type="text/javascript" src="${contextPath}/assets/js/js/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="${contextPath}/assets/js/js.js"></script>

</head>

<body>
 <div class="hrader" id="header">
  <div class="top">
   <a href="login" style="color:#C94E13;">请登录</a> 
   <a href="reg">注册</a>
   <ul class="topNav">
     <li><a href="vipOrder">我的订单 </a></li>
    <li class="gouwuche"><a href="car">购物车</a> <strong style="color:#C94E13;">3</strong></li>
    <li class="shoucangjia"><a href="shoucang">收藏夹</a></li>
    <li class="kefus"><a href="#">联系客服</a></li>
    <li><a href="#" class="lan">中文</a></li>
    <li><a href="#" class="lan">English</a></li>
    <div class="clears"></div>
   </ul><!--topNav/-->
  </div><!--top/-->
 </div><!--hrader/-->
 <div class="mid">
  <h1 class="logo" style="text-align:left;">
  <a href="index"><img src="${contextPath}/assets/images/logo.png" width="304" height="74" /></a>
  </h1>
  <form action="#" method="get" class="subBox">
   <div class="subBox2">
    <input type="text" class="subText" />
    <input type="image" src="${contextPath}/assets/images/sub.jpg" width="95" height="32" class="subImg" />
    <div class="hotci">
    <a href="#">酷派大神</a>
    <a href="#">三星s5</a>
    <a href="#">诺基亚1020</a>
    <a href="#">Iphone 6</a>
    <a href="#">htc one</a>
   </div><!--hotci/-->
   </div><!--subBox2/-->
  </form><!--subBox/-->
  <div class="ding-gou">
   <div class="ding">
    <a href="vipOrder"><img src="${contextPath}/assets/images/dingdan.jpg" width="106" height="32" /></a>
   </div><!--ding/-->
   <div class="gou">
    <a href="car"><img src="${contextPath}/assets/images/gouwuche.jpg" width="126" height="32" /></a>
   </div><!--gou/-->
   <div class="clears"></div>
  </div><!--ding-gou/-->
 </div><!--mid-->
 <div class="navBox navBg1">
  <ul class="nav">
   <li><a href="prolist">首页</a></li>
   <li><a href="buy">我要买</a></li>
   <li><a href="vip-product">我要卖</a></li>
   <li><a href="vipOrder">会员中心</a></li>
   <li><a href="xuanshang">悬赏榜</a></li>
   <li><a href="luntan" class="luntan">论坛</a></li>
   <li><a href="help">帮助</a></li>
   <div class="clears"></div>
  </ul><!--nav/-->
 </div><!--navBox/-->
 <form action="#" method="get" class="proDingzhi">
  <img src="${contextPath}/assets/images/dingzhi.jpg" width="972" height="167" />
  <div class="bdsharebuttonbox">
  <a href="#" class="bds_more" data-cmd="more"></a><a href="#" class="bds_qzone" data-cmd="qzone" title="分享到QQ空间"></a><a href="#" class="bds_tsina" data-cmd="tsina" title="分享到新浪微博"></a><a href="#" class="bds_tqq" data-cmd="tqq" title="分享到腾讯微博"></a><a href="#" class="bds_renren" data-cmd="renren" title="分享到人人网"></a><a href="#" class="bds_weixin" data-cmd="weixin" title="分享到微信"></a></div>
<script>window._bd_share_config={"common":{"bdSnsKey":{},"bdText":"","bdMini":"2","bdMiniList":false,"bdPic":"","bdStyle":"0","bdSize":"24"},"share":{}};with(document)0[(getElementsByTagName('head')[0]||body).appendChild(createElement('script')).src='http://bdimg.share.baidu.com/static/api/js/share.js?v=89860593.js?cdnversion='+~(-new Date()/36e5)];</script>
  <table class="proDSel">
   <tr>
    <th>
     <h2>推荐</h2>
    </th>
    <td>
     <div class="proPosition">
      <ul class="xuan" style="font-size: 16px">
       <li><a href="#">食品</a></li>
       <li><a href="#">服饰</a></li>
       <li><a href="#">家居</a></li>
       <li><a href="#">家电</a></li>
       <li><a href="#">数码</a></li>
       <li><a href="#">手机</a></li>
       <li><a href="#">美妆</a></li>
       <li><a href="#">珠宝</a></li>
       <li><a href="#">文玩</a></li>
       <li><a href="#">二手</a></li>
      </ul><!--xuan/-->
     </div>
    </td>
   </tr>

  </table><!--proDSel/-->
  <div style="height:15px;">&nbsp;</div>
  <ul class="proSelect">
   <li>综合</li>
   <li>销量 &uarr;</li>
   <li>评论 &uarr;</li>
   <li>价格 &uarr;</li>
   <div class="clears"></div>
  </ul><!--proSelect/-->
  <div class="phoneBox">
   <dl>
    <dt><a href="buyinfo"><img src="${contextPath}/assets/images/phone5.png" /></a></dt>
    <dd>
     <h3>￥4800.00</h3>
     <div class="phonePars">
      Apple 苹果 iPhone 5s 16G TD-LTE/TD-SCDMA/WCDMA/GSM 4G手机 金
     </div><!--phonePar/-->
     <div class="xiaoliang">
      <span class="blue">157451条评价</span>
      <span class="pad">上海有货</span>
     </div><!--xiaoliang/-->
     <div class="jiaru-shoucang">
      <span class="jiaruCar">加入购物车</span>
      <span class="shoucangCar"><a href="quanjing/index">选用此模型</a></span>>
      <div class="clears"></div>
     </div><!--jiaru-shoucang/-->
    </dd>
   </dl>
   <dl>
    <dt><a href="buyinfo"><img src="${contextPath}/assets/images/phone4.png" /></a></dt>
    <dd>
     <h3>￥4800.00</h3>
     <div class="phonePars">
      Apple 苹果 iPhone 5s 16G TD-LTE/TD-SCDMA/WCDMA/GSM 4G手机 金
     </div><!--phonePar/-->
     <div class="xiaoliang">
      <span class="blue">157451条评价</span>
      <span class="pad">上海有货</span>
     </div><!--xiaoliang/-->
     <div class="jiaru-shoucang">
      <span class="jiaruCar">加入购物车</span>
      <span class="shoucangCar"><a href="quanjing/index">选用此模型</a></span>
      <div class="clears"></div>
     </div><!--jiaru-shoucang/-->
    </dd>
   </dl>
   <dl>
    <dt><a href="buyinfo"><img src="${contextPath}/assets/images/phone3.png" /></a></dt>
    <dd>
     <h3>￥4800.00</h3>
     <div class="phonePars">
      Apple 苹果 iPhone 5s 16G TD-LTE/TD-SCDMA/WCDMA/GSM 4G手机 金
     </div><!--phonePar/-->
     <div class="xiaoliang">
      <span class="blue">157451条评价</span>
      <span class="pad">上海有货</span>
     </div><!--xiaoliang/-->
     <div class="jiaru-shoucang">
      <span class="jiaruCar">加入购物车</span>
      <span class="shoucangCar"><a href="quanjing/index">选用此模型</a></span>
      <div class="clears"></div>
     </div><!--jiaru-shoucang/-->
    </dd>
   </dl>
   <dl>
    <dt><a href="buyinfo"><img src="${contextPath}/assets/images/phone2.png" /></a></dt>
    <dd>
     <h3>￥4800.00</h3>
     <div class="phonePars">
      Apple 苹果 iPhone 5s 16G TD-LTE/TD-SCDMA/WCDMA/GSM 4G手机 金
     </div><!--phonePar/-->
     <div class="xiaoliang">
      <span class="blue">157451条评价</span>
      <span class="pad">上海有货</span>
     </div><!--xiaoliang/-->
     <div class="jiaru-shoucang">
      <span class="jiaruCar">加入购物车</span>
      <span class="shoucangCar"><a href="quanjing/index">选用此模型</a></span>
      <div class="clears"></div>
     </div><!--jiaru-shoucang/-->
    </dd>
   </dl>
   <dl>
    <dt><a href="buyinfo"><img src="${contextPath}/assets/images/phone1.png" /></a></dt>
    <dd>
     <h3>￥4800.00</h3>
     <div class="phonePars">
      Apple 苹果 iPhone 5s 16G TD-LTE/TD-SCDMA/WCDMA/GSM 4G手机 金
     </div><!--phonePar/-->
     <div class="xiaoliang">
      <span class="blue">157451条评价</span>
      <span class="pad">上海有货</span>
     </div><!--xiaoliang/-->
     <div class="jiaru-shoucang">
      <span class="jiaruCar">加入购物车</span>
      <span class="shoucangCar"><a href="quanjing/index">选用此模型</a></span>
      <div class="clears"></div>
     </div><!--jiaru-shoucang/-->
    </dd>
   </dl>
   <dl>
    <dt><a href="buyinfo"><img src="${contextPath}/assets/images/phone5.png" /></a></dt>
    <dd>
     <h3>￥4800.00</h3>
     <div class="phonePars">
      Apple 苹果 iPhone 5s 16G TD-LTE/TD-SCDMA/WCDMA/GSM 4G手机 金
     </div><!--phonePar/-->
     <div class="xiaoliang">
      <span class="blue">157451条评价</span>
      <span class="pad">上海有货</span>
     </div><!--xiaoliang/-->
     <div class="jiaru-shoucang">
      <span class="jiaruCar">加入购物车</span>
      <span class="shoucangCar"><a href="quanjing/index">选用此模型</a></span>
      <div class="clears"></div>
     </div><!--jiaru-shoucang/-->
    </dd>
   </dl>
   <dl>
    <dt><a href="buyinfo"><img src="${contextPath}/assets/images/phone4.png" /></a></dt>
    <dd>
     <h3>￥4800.00</h3>
     <div class="phonePars">
      Apple 苹果 iPhone 5s 16G TD-LTE/TD-SCDMA/WCDMA/GSM 4G手机 金
     </div><!--phonePar/-->
     <div class="xiaoliang">
      <span class="blue">157451条评价</span>
      <span class="pad">上海有货</span>
     </div><!--xiaoliang/-->
     <div class="jiaru-shoucang">
      <span class="jiaruCar">加入购物车</span>
      <span class="shoucangCar"><a href="quanjing/index">选用此模型</a></span>
      <div class="clears"></div>
     </div><!--jiaru-shoucang/-->
    </dd>
   </dl>
   <dl>
    <dt><a href="buyinfo"><img src="${contextPath}/assets/images/phone3.png" /></a></dt>
    <dd>
     <h3>￥4800.00</h3>
     <div class="phonePars">
      Apple 苹果 iPhone 5s 16G TD-LTE/TD-SCDMA/WCDMA/GSM 4G手机 金
     </div><!--phonePar/-->
     <div class="xiaoliang">
      <span class="blue">157451条评价</span>
      <span class="pad">上海有货</span>
     </div><!--xiaoliang/-->
     <div class="jiaru-shoucang">
      <span class="jiaruCar">加入购物车</span>
      <span class="shoucangCar"><a href="quanjing/index">选用此模型</a></span>
      <div class="clears"></div>
     </div><!--jiaru-shoucang/-->
    </dd>
   </dl>
   <dl>
    <dt><a href="buyinfo"><img src="${contextPath}/assets/images/phone2.png" /></a></dt>
    <dd>
     <h3>￥4800.00</h3>
     <div class="phonePars">
      Apple 苹果 iPhone 5s 16G TD-LTE/TD-SCDMA/WCDMA/GSM 4G手机 金
     </div><!--phonePar/-->
     <div class="xiaoliang">
      <span class="blue">157451条评价</span>
      <span class="pad">上海有货</span>
     </div><!--xiaoliang/-->
     <div class="jiaru-shoucang">
      <span class="jiaruCar">加入购物车</span>
      <span class="shoucangCar"><a href="quanjing/index">选用此模型</a></span>
      <div class="clears"></div>
     </div><!--jiaru-shoucang/-->
    </dd>
   </dl>
   <dl>
    <dt><a href="buyinfo"><img src="${contextPath}/assets/images/phone1.png" /></a></dt>
    <dd>
     <h3>￥4800.00</h3>
     <div class="phonePars">
      Apple 苹果 iPhone 5s 16G TD-LTE/TD-SCDMA/WCDMA/GSM 4G手机 金
     </div><!--phonePar/-->
     <div class="xiaoliang">
      <span class="blue">157451条评价</span>
      <span class="pad">上海有货</span>
     </div><!--xiaoliang/-->
     <div class="jiaru-shoucang">
      <span class="jiaruCar">加入购物车</span>
      <span class="shoucangCar"><a href="quanjing/index">选用此模型</a></span>
      <div class="clears"></div>
     </div><!--jiaru-shoucang/-->
    </dd>
   </dl>
   <dl>
    <dt><a href="buyinfo"><img src="${contextPath}/assets/images/phone5.png" /></a></dt>
    <dd>
     <h3>￥4800.00</h3>
     <div class="phonePars">
      Apple 苹果 iPhone 5s 16G TD-LTE/TD-SCDMA/WCDMA/GSM 4G手机 金
     </div><!--phonePar/-->
     <div class="xiaoliang">
      <span class="blue">157451条评价</span>
      <span class="pad">上海有货</span>
     </div><!--xiaoliang/-->
     <div class="jiaru-shoucang">
      <span class="jiaruCar">加入购物车</span>
      <span class="shoucangCar"><a href="quanjing/index">选用此模型</a></span>
      <div class="clears"></div>
     </div><!--jiaru-shoucang/-->
    </dd>
   </dl>
   <dl>
    <dt><a href="buyinfo"><img src="${contextPath}/assets/images/phone4.png" /></a></dt>
    <dd>
     <h3>￥4800.00</h3>
     <div class="phonePars">
      Apple 苹果 iPhone 5s 16G TD-LTE/TD-SCDMA/WCDMA/GSM 4G手机 金
     </div><!--phonePar/-->
     <div class="xiaoliang">
      <span class="blue">157451条评价</span>
      <span class="pad">上海有货</span>
     </div><!--xiaoliang/-->
     <div class="jiaru-shoucang">
      <span class="jiaruCar">加入购物车</span>
      <span class="shoucangCar"><a href="quanjing/index">选用此模型</a></span>
      <div class="clears"></div>
     </div><!--jiaru-shoucang/-->
    </dd>
   </dl>
   <dl>
    <dt><a href="buyinfo"><img src="${contextPath}/assets/images/phone3.png" /></a></dt>
    <dd>
     <h3>￥4800.00</h3>
     <div class="phonePars">
      Apple 苹果 iPhone 5s 16G TD-LTE/TD-SCDMA/WCDMA/GSM 4G手机 金
     </div><!--phonePar/-->
     <div class="xiaoliang">
      <span class="blue">157451条评价</span>
      <span class="pad">上海有货</span>
     </div><!--xiaoliang/-->
     <div class="jiaru-shoucang">
      <span class="jiaruCar">加入购物车</span>
      <span class="shoucangCar"><a href="quanjing/index">选用此模型</a></span>
      <div class="clears"></div>
     </div><!--jiaru-shoucang/-->
    </dd>
   </dl>
   <dl>
    <dt><a href="buyinfo"><img src="${contextPath}/assets/images/phone2.png" /></a></dt>
    <dd>
     <h3>￥4800.00</h3>
     <div class="phonePars">
      Apple 苹果 iPhone 5s 16G TD-LTE/TD-SCDMA/WCDMA/GSM 4G手机 金
     </div><!--phonePar/-->
     <div class="xiaoliang">
      <span class="blue">157451条评价</span>
      <span class="pad">上海有货</span>
     </div><!--xiaoliang/-->
     <div class="jiaru-shoucang">
      <span class="jiaruCar">加入购物车</span>
      <span class="shoucangCar"><a href="quanjing/index">选用此模型</a></span>
      <div class="clears"></div>
     </div><!--jiaru-shoucang/-->
    </dd>
   </dl>
   <dl>
    <dt><a href="buyinfo"><img src="${contextPath}/assets/images/phone1.png" /></a></dt>
    <dd>
     <h3>￥4800.00</h3>
     <div class="phonePars">
      Apple 苹果 iPhone 5s 16G TD-LTE/TD-SCDMA/WCDMA/GSM 4G手机 金
     </div><!--phonePar/-->
     <div class="xiaoliang">
      <span class="blue">157451条评价</span>
      <span class="pad">上海有货</span>
     </div><!--xiaoliang/-->
     <div class="jiaru-shoucang">
      <span class="jiaruCar">加入购物车</span>
      <span class="shoucangCar"><a href="quanjing/index">选用此模型</a></span>
      <div class="clears"></div>
     </div><!--jiaru-shoucang/-->
    </dd>
   </dl>
   <dl>
    <dt><a href="buyinfo"><img src="${contextPath}/assets/images/phone5.png" /></a></dt>
    <dd>
     <h3>￥4800.00</h3>
     <div class="phonePars">
      Apple 苹果 iPhone 5s 16G TD-LTE/TD-SCDMA/WCDMA/GSM 4G手机 金
     </div><!--phonePar/-->
     <div class="xiaoliang">
      <span class="blue">157451条评价</span>
      <span class="pad">上海有货</span>
     </div><!--xiaoliang/-->
     <div class="jiaru-shoucang">
      <span class="jiaruCar">加入购物车</span>
      <span class="shoucangCar"><a href="quanjing/index">选用此模型</a></span>
      <div class="clears"></div>
     </div><!--jiaru-shoucang/-->
    </dd>
   </dl>
   <dl>
    <dt><a href="buyinfo"><img src="${contextPath}/assets/images/phone4.png" /></a></dt>
    <dd>
     <h3>￥4800.00</h3>
     <div class="phonePars">
      Apple 苹果 iPhone 5s 16G TD-LTE/TD-SCDMA/WCDMA/GSM 4G手机 金
     </div><!--phonePar/-->
     <div class="xiaoliang">
      <span class="blue">157451条评价</span>
      <span class="pad">上海有货</span>
     </div><!--xiaoliang/-->
     <div class="jiaru-shoucang">
      <span class="jiaruCar">加入购物车</span>
      <span class="shoucangCar"><a href="quanjing/index">选用此模型</a></span>
      <div class="clears"></div>
     </div><!--jiaru-shoucang/-->
    </dd>
   </dl>
   <dl>
    <dt><a href="buyinfo"><img src="${contextPath}/assets/images/phone3.png" /></a></dt>
    <dd>
     <h3>￥4800.00</h3>
     <div class="phonePars">
      Apple 苹果 iPhone 5s 16G TD-LTE/TD-SCDMA/WCDMA/GSM 4G手机 金
     </div><!--phonePar/-->
     <div class="xiaoliang">
      <span class="blue">157451条评价</span>
      <span class="pad">上海有货</span>
     </div><!--xiaoliang/-->
     <div class="jiaru-shoucang">
      <span class="jiaruCar">加入购物车</span>
      <span class="shoucangCar"><a href="quanjing/index">选用此模型</a></span>
      <div class="clears"></div>
     </div><!--jiaru-shoucang/-->
    </dd>
   </dl>
   <dl>
    <dt><a href="buyinfo"><img src="${contextPath}/assets/images/phone2.png" /></a></dt>
    <dd>
     <h3>￥4800.00</h3>
     <div class="phonePars">
      Apple 苹果 iPhone 5s 16G TD-LTE/TD-SCDMA/WCDMA/GSM 4G手机 金
     </div><!--phonePar/-->
     <div class="xiaoliang">
      <span class="blue">157451条评价</span>
      <span class="pad">上海有货</span>
     </div><!--xiaoliang/-->
     <div class="jiaru-shoucang">
      <span class="jiaruCar">加入购物车</span>
      <span class="shoucangCar"><a href="quanjing/index">选用此模型</a></span>
      <div class="clears"></div>
     </div><!--jiaru-shoucang/-->
    </dd>
   </dl>
   <dl>
    <dt><a href="buyinfo"><img src="${contextPath}/assets/images/phone1.png" /></a></dt>
    <dd>
     <h3>￥4800.00</h3>
     <div class="phonePars">
      Apple 苹果 iPhone 5s 16G TD-LTE/TD-SCDMA/WCDMA/GSM 4G手机 金
     </div><!--phonePar/-->
     <div class="xiaoliang">
      <span class="blue">157451条评价</span>
      <span class="pad">上海有货</span>
     </div><!--xiaoliang/-->
     <div class="jiaru-shoucang">
      <span class="jiaruCar">加入购物车</span>
      <span class="shoucangCar"><a href="quanjing/index">选用此模型</a></span>
      <div class="clears"></div>
     </div><!--jiaru-shoucang/-->
    </dd>
   </dl>
   <div class="clears"></div>
  </div><!--phoneBox/-->
 </form><!--proDingzhi/-->
 <div class="footBox">
  <div class="footers">
   <div class="footersLeft">
    <a href="index"><img src="${contextPath}/assets/images/ftlogo.jpg" width="240" height="64" /></a>
    <h3 class="ftphone">400 000 0000 </h3>
    <div class="ftKe">
     客服 7x24小时(全年无休)<br />
     <span>客服邮箱：kefu@webqin.net </span>
    </div><!--ftKe/-->
   </div><!--footersLeft/-->
   <div class="footersRight">
    <ul>
     <li class="ftTitle">新手指南</li>
     <li><a href="#">购物流程</a></li>
     <li><a href="#">会员计划及划分</a></li>
     <li><a href="#">优惠券规则</a></li>
     <li><a href="#">联系客服</a></li>
     <li><a href="#">常见问题</a></li>
    </ul>
    <ul>
     <li class="ftTitle">付款方式</li>
     <li><a href="#">在线支付</a></li>
     <li><a href="#">礼品卡支付</a></li>
     <li><a href="#">货到付款</a></li>
     <li><a href="#">银行付款</a></li>
    </ul>
    <ul>
     <li class="ftTitle">配送服务</li>
     <li><a href="#">配送时效及运费</a></li>
     <li><a href="#">超时赔付</a></li>
     <li><a href="#">验货与签收</a></li>
     <li><a href="#">配货信息跟踪</a></li>
    </ul>
    <ul>
     <li class="ftTitle">售后服务</li>
     <li><a href="#">退换货政策</a></li>
     <li><a href="#">退换货区域</a></li>
     <li><a href="#">退款时限</a></li>
     <li><a href="#">先行赔付</a></li>
     <li><a href="#">发票说明</a></li>
    </ul>
    <ul>
     <li class="ftTitle">特色服务</li>
     <li><a href="#">礼品卡</a></li>
     <li><a href="#">产品试用</a></li>
     <li><a href="#">花粉中心</a></li>
     <li><a href="#">快速购物</a></li>
     <li><a href="#">推荐好友</a></li>
    </ul>
    
    <div class="clears"></div>
   </div><!--footersRight/-->
   <div class="clears"></div>
  </div><!--footers/-->
 </div><!--footBox/-->
 <div class="footer" style="text-align:left;">
  <a href="#">关于我们</a>
  <a href="#">友情链接</a>
  <a href="#">版权声明</a>
  <a href="#">网站地图</a>
  <br />
  <span>&copy; 2014 Unqezi 使用前必读 沪ICP备 12007626号-1</span>
 </div><!--footer/-->
</body>
</html>
