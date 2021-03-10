<%@include file="common/header.jspf" %>
<%@include file="common/navigation.jspf" %>


<div class="container">
	<form:form method="post" modelAttribute="todo">
		<form:hidden path="id" />
		<fieldset class="form-group">
			<form:label path="desc">Description : </form:label>
			<form:input path="desc" name="desc" type="text" class="form-control"
				required="required"></form:input>
			<form:errors path="desc" cssClass="text-warning"></form:errors>
		</fieldset>
		<fieldset class="form-group">
			<form:label path="targetDate">TargetDate : </form:label>
			<form:input path="targetDate" name="desc" type="text"
				class="form-control" required="required"></form:input>
			<form:errors path="targetDate" cssClass="text-warning"></form:errors>
		</fieldset>
		<fieldset class="form-group">
			<form:label path="done">Is Done : </form:label>
			<form:input path="done" name="done" type="text"
				class="form-control" required="required"></form:input>
			<form:errors path="targetDate" cssClass="text-warning"></form:errors>
		</fieldset>
		
		<button type="submit" value="submit" class="btn btn-success">ADD</button>
	</form:form>
</div>
<%@include file="common/footer.jspf" %>
