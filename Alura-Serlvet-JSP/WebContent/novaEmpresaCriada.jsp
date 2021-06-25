<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
	<body>
	
		<c:if test="${not empty empresa}"><!-- testa se a variável empresa não está vazia -->
			Empresa ${ empresa } cadastrada com sucesso!
		</c:if>
		
		<c:if test="${empty empresa}"><!-- testa se a variável empresa está vazia -->
			Nenhuma empresa cadastrada!
		</c:if>

	</body>
</html>
