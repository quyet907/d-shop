<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
	<div>

		<table>
			<thead>
				<tr>
					<th>Name</th>
					<th></th>
					<th>Quantity</th>
					<th></th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="cartItem" items="${cart.cart}">
					<tr>
						<td>${cartItem.key.name}</td>
						<td>
							<button onclick="subtract(${cartItem.key.id})"
								<c:if test="${cartItem.value == 1}">disabled="disabled"</c:if>>
								-</button>
						</td>
						<td>${cartItem.value}</td>
						<td>
							<button onclick="add(${cartItem.key.id})">+</button>
						</td>
						<td>
							<button onclick="remove(${cartItem.key.id})">x</button>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>

<script>
	const add = (productId) => {
		$.post("cart/add/" + productId, (data, status) => {
			console.log({data});
			console.log({status});
		})
	}
</script>
</html>


