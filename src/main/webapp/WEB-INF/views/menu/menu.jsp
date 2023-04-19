<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://code.jquery.com/jquery-latest.min.js"></script>
    <style>
        div#menu-container{text-align:center;}
        div.menu-test{width:50%; margin:0 auto; text-align:center;}
        div.result{width:70%; margin:0 auto;}
    </style>
    <script>
        $(function(){
            $("#menuRecommendationFrm .btn-send").on("click",function(){
                $.ajax({
                    url  : "${pageContext.request.contextPath}/menu/menu",
                    data : $("#menuRecommendationFrm").serialize(),
                    dataType: "json",
                    type : "get",
                    success : function(data){
                        console.log(data);
                        var html = "<table class=table>";
                        html+="<tr><th>음식점</th><th>메뉴</th><th>가격</th></tr>";
                        for(var i in data){
                            html += "<tr><td>"+data[i].restaurant+"</td>";
                            html += "<td>"+data[i].foodname+"</td>";
                            html += "<td>"+data[i].price+"</td></tr>";
                        }
                        html+="</table>";
                        $("#menuRecommendation-result").html(html);

                    },
                    error : function(jqxhr, textStatus, errorThrown){
                        console.log("ajax 처리 실패 : ",JSON.stringify(jqxhr));
                    }

                });
            });
        });
    </script>
</head>
<body>
<div id="menu-container">
    <div class="menu-test">
        <h4>추천메뉴(GET)</h4>
        <form id="menuRecommendationFrm">
            <div class="form-check form-check-inline">
                <input type="radio" class="form-check-input" name="foodType" id="kr" value="kr" checked>
                <label for="kr" class="form-check-label">한식</label>&nbsp;
                <input type="radio" class="form-check-input" name="foodType" id="ch" value="ch">
                <label for="ch" class="form-check-label">중식</label>&nbsp;
                <input type="radio" class="form-check-input" name="foodType" id="jp" value="jp">
                <label for="jp" class="form-check-label">일식</label>&nbsp;
            </div>
            <br />
            <div class="form-check form-check-inline">
                <input type="radio" class="form-check-input" name="taste" id="hot" value="hot" checked>
                <label for="hot" class="form-check-label">매운맛</label>&nbsp;
                <input type="radio" class="form-check-input" name="taste" id="mild" value="mild">
                <label for="mild" class="form-check-label">순한맛</label>
            </div>
            <br />
            <input type="button" class="btn btn-block btn-outline-success btn-send" value="전송" >
        </form>
    </div>
    <div class="result" id="menuRecommendation-result"></div>
</div>
</body>
</html>
