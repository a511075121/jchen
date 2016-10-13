<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--[if IE 9 ]><html class="ie9"><![endif]-->
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
        <meta name="format-detection" content="telephone=no">
        <meta charset="UTF-8">

        <meta name="description" content="Violate Responsive Admin Template">
        <meta name="keywords" content="Super Admin, Admin, Template, Bootstrap">

        <title>管理系统 | 欢迎页面</title>
            
        <!-- CSS -->
        <link href="../../../assert/global/css/bootstrap.min.css" rel="stylesheet">
        <link href="../../../assert/global/css/animate.min.css" rel="stylesheet">
        <link href="../../../assert/global/css/font-awesome.min.css" rel="stylesheet">
        <link href="../../../assert/global/css/form.css" rel="stylesheet">
        <link href="../../../assert/global/css/calendar.css" rel="stylesheet">
        <link href="../../../assert/global/css/style.css" rel="stylesheet">
        <link href="../../../assert/global/css/icons.css" rel="stylesheet">
        <link href="../../../assert/global/css/generics.css" rel="stylesheet"> 
    </head>
    <body id="skin-blur-violate">

        <header id="header" class="media">
            <a href="" id="menu-toggle"></a> 
            <a class="logo pull-left" href="#">管理系统</a>
            
            <div class="media-body">
                <div class="media" id="top-menu">
                    <!-- <div class="pull-left tm-icon">
                        <a data-drawer="messages" class="drawer-toggle" href="">
                            <i class="sa-top-message"></i>
                            <i class="n-count animated">5</i>
                            <span>信息</span>
                        </a>
                    </div>
                    <div class="pull-left tm-icon">
                        <a data-drawer="notifications" class="drawer-toggle" href="">
                            <i class="sa-top-updates"></i>
                            <i class="n-count animated">9</i>
                            <span>Updates</span>
                        </a>
                    </div> -->

                    

                    <div id="time" class="pull-right">
                        <span id="hours"></span>
                        :
                        <span id="min"></span>
                        :
                        <span id="sec"></span>
                    </div>
                    
                    <!-- <div class="media-body">
                        <input type="text" class="main-search">
                    </div> -->
                </div>
            </div>
        </header>
        
        <div class="clearfix"></div>
        
        <section id="main" class="p-relative" role="main">
            
            <!-- Sidebar -->
            <aside id="sidebar">
                
                <!-- Sidbar Widgets -->
                <jsp:include page="../common/header.jsp"></jsp:include>
                
                <!-- Side Menu -->
                <jsp:include page="../common/left.jsp"></jsp:include>

            </aside>
        
            <!-- Content -->
            <section id="content" class="container">
            	<div>欢迎回来</div>
                
            </section>

            <!-- Older IE Message -->
            <!--[if lt IE 9]>
                <div class="ie-block">
                    <h1 class="Ops">Ooops!</h1>
                    <p>You are using an outdated version of Internet Explorer, upgrade to any of the following web browser in order to access the maximum functionality of this website. </p>
                    <ul class="browsers">
                        <li>
                            <a href="https://www.google.com/intl/en/chrome/browser/">
                                <img src="img/browsers/chrome.png" alt="">
                                <div>Google Chrome</div>
                            </a>
                        </li>
                        <li>
                            <a href="http://www.mozilla.org/en-US/firefox/new/">
                                <img src="img/browsers/firefox.png" alt="">
                                <div>Mozilla Firefox</div>
                            </a>
                        </li>
                        <li>
                            <a href="http://www.opera.com/computer/windows">
                                <img src="img/browsers/opera.png" alt="">
                                <div>Opera</div>
                            </a>
                        </li>
                        <li>
                            <a href="http://safari.en.softonic.com/">
                                <img src="img/browsers/safari.png" alt="">
                                <div>Safari</div>
                            </a>
                        </li>
                        <li>
                            <a href="http://windows.microsoft.com/en-us/internet-explorer/downloads/ie-10/worldwide-languages">
                                <img src="img/browsers/ie.png" alt="">
                                <div>Internet Explorer(New)</div>
                            </a>
                        </li>
                    </ul>
                    <p>Upgrade your browser for a Safer and Faster web experience. <br/>Thank you for your patience...</p>
                </div>   
            <![endif]-->
        </section>
        
        <!-- Javascript Libraries -->
        <!-- jQuery -->
        <script src="../../../assert/global/js/jquery.min.js"></script> <!-- jQuery Library -->
        <script src="../../../assert/global/js/jquery-ui.min.js"></script> <!-- jQuery UI -->
        <script src="../../../assert/global/js/jquery.easing.1.3.js"></script> <!-- jQuery Easing - Requirred for Lightbox + Pie Charts-->

        <!-- Bootstrap -->
        <script src="../../../assert/global/js/bootstrap.min.js"></script>

        <!--  Form Related -->
        <script src="../../../assert/global/js/icheck.js"></script> <!-- Custom Checkbox + Radio -->

        <!-- UX -->
        <script src="../../../assert/global/js/scroll.min.js"></script> <!-- Custom Scrollbar -->

        <!-- Other -->
        <script src="../../../assert/global/js/calendar.min.js"></script> <!-- Calendar -->
        <script src="../../../assert/global/js/feeds.min.js"></script>

        <!-- All JS functions -->
        <script src="../../../assert/global/js/functions.js"></script>
    </body>
</html>
