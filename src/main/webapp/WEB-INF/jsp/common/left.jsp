<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<ul class="list-unstyled side-menu">
	<c:forEach var="rootMenus" items="${_menuList }">
		<c:choose>
			<c:when test="${null == rootMenus.list}">
				<li><a class="${rootMenus.icon }" href="${rootMenus.controller }">
				<span class="menu-item">${rootMenus.name }</span></a>
				</li>
			</c:when>
			<c:otherwise>
				<li class="dropdown"><a class="${rootMenus.icon }" href="${rootMenus.controller }">
				<span class="menu-item">${rootMenus.name }</span></a>
				<ul class="list-unstyled menu-item">
					<c:forEach var="subMenus" items="${rootMenus.list }">
						<li><a href="${subMenus.controller }">${subMenus.name }</a></li>
					</c:forEach>
				</ul>
				</li>
			</c:otherwise>
		</c:choose>
	</c:forEach>

	<!-- <li class="active"><a class="sa-side-home" href="#">
			<span class="menu-item">主页</span>
	</a></li>
	<li class="dropdown"><a class="sa-side-form" href="#"> <span
			class="menu-item">现场购买</span>
	</a>
		<ul class="list-unstyled menu-item">
			<li><a href="#">购买列表</a></li>
		</ul></li>
	<li class="dropdown"><a class="sa-side-typography" href="#"> <span
			class="menu-item">网上购买</span>
	</a>
		<ul class="list-unstyled menu-item">
			<li><a href="#">订单列表</a></li>
			<li><a href="#">客户购买清单列表</a></li>
		</ul></li>
	<li class="dropdown"><a class="sa-side-ui" href="#"> <span
			class="menu-item">基础信息</span>
	</a>
		<ul class="list-unstyled menu-item">
			<li><a href="#">批次列表</a></li>
			<li><a href="#">商品列表</a></li>
			<li><a href="#">商品sku列表</a></li>
			<li><a href="#">商品货源列表</a></li>
			<li><a href="#">员工列表</a></li>
			<li><a href="#">客户列表</a></li>
		</ul></li>
	<li class="dropdown"><a class="sa-side-page" href="#"> <span
			class="menu-item">系统设置</span>
	</a>
		<ul class="list-unstyled menu-item">
			<li><a href="#">用户列表</a></li>
			<li><a href="#">角色列表</a></li>
			<li><a href="#">资源列表</a></li>
			<li><a href="#">系统日志</a></li>
		</ul></li>
	<li>
        <a class="sa-side-table" href="#">
            <span class="menu-item">数据统计</span>
   	 	</a>
    </li> -->
</ul>