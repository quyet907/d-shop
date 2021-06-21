<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
	<div style="display: flex; align-items: center; flex-direction: column">
		<div
			style="display: grid; grid-template-columns: repeat(4, 1fr); gap: 24px; width: 1200px">

			<c:forEach var="item" items="${productPage.content }">
				<div>
					<div
						style="
							height: 250px;
							background-image: url('${item.image}');
							background-size: cover;
						"
					></div>
					<h4>${item.name }</h4>
					
						<button class="button-add-prd" id="${item.id }">Add to cart</button>
					
				</div>
			</c:forEach>
		</div>

		<div style="margin-top: 40px">
			<c:forEach var="step" begin="1" end="${productPage.totalPages }">
				<a href="/product?page=${step }">
					<button style="padding: 8px 16px">${step }</button>
				</a>
			</c:forEach>
		</div>
	</div>

</body>

<script>
const add = (productId) => {
	$.post("cart/add/" + productId, (data, status) => {
		console.log({data});
		console.log({status});
	})
}

$(document).ready( () => {
	$(".button-add-prd").click((e) => {
		add(e.target.id);
		// $.post("cart/add/" )
	})
})
</script>
</html>