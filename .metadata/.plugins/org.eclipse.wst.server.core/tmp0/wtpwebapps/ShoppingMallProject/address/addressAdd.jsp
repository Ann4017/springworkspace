<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="${pageContext.request.contextPath}/resources/css/address/addressAdd.css" rel="stylesheet" />
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
    <div id="addr-add">
    
        <div><h2>배송지 추가</h2></div>
        <hr>
        <form action="addressAdd.do" method="post" onsubmit="return validateForm()">
	        <input type="hidden" name="user_num" value="${user_num}">
	        <div>
	           <div class="marg">
		           	받는사람<br>
		           	<div id="name"><input class="full" name="recipient"></div>
	           </div>
	           <div class="marg">
		           	휴대전화 번호<br>
		           	<div id="phoneNumber"><input class="full" name="phone_num"></div>
	           </div>
	           
	           <div class="marg">
		           	주소
		           	<div id="postalCode">
		           		<div><input id="postal" name="postal_num" placeholder="우편번호"></div>
		           		<div><input type="button"  onclick="findAddress()" id="search" value="우편 번호 찾기"></div>
		           	</div>
		           	<div id="addr"><input id="address" class="full" name="address" placeholder="주소"></div>
		           	<div id="detailAddr"><input id="detail_address" class="full" name="detail_address" placeholder="상세주소"></div>
	           </div>
	           
	           
	           <div class="marg">
		            배송 메시지
		            <div id="request"><input class="full" name="request"></div>
		        </div>
	           <div class="marg">
				    <input type="checkbox" id="base" name="base" value="1">
			      	기본 배송지로 설정
			   </div>   
	        </div>
	        <br>
	        <br>
	        <br>
	        <br>
	        <br>
	        <div id="button">
	            <button type="submit" id="add" >추가하기</button>
	            <button type="button" id="return" onclick="location.href='address.do'">돌아가기</button>
	        </div>
    	 </form>    
    </div>
    
	<script>
        function validateForm() {
            // Get input values
            var recipient = document.getElementsByName("recipient")[0].value;
            var phoneNum = document.getElementsByName("phone_num")[0].value;
            var postalNum = document.getElementsByName("postal_num")[0].value;
            var address = document.getElementsByName("address")[0].value;
            var detailAddress = document.getElementsByName("detail_address")[0].value;
            var request = document.getElementsByName("request")[0].value;

            if (recipient.trim() === '' || phoneNum.trim() === '' || postalNum.trim() === '' ||
                address.trim() === '' || detailAddress.trim() === '' || request.trim() === '') {
                alert('모든 필드를 입력하세요.');
                return false; 
            }

            return true;
        }
    </script>
    <script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
    <script>
    function findAddress() {
        new daum.Postcode({
            oncomplete: function(data) {
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

                // 각 주소의 노출 규칙에 따라 주소를 조합한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var addr = ''; // 주소 변수
                var extraAddr = ''; // 참고항목 변수

                //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                    addr = data.roadAddress;
                } else { // 사용자가 지번 주소를 선택했을 경우(J)
                    addr = data.jibunAddress;
                }

                // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.
                if(data.userSelectedType === 'R'){
                    // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                    // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                    if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                        extraAddr += data.bname;
                    }
                    // 건물명이 있고, 공동주택일 경우 추가한다.
                    if(data.buildingName !== '' && data.apartment === 'Y'){
                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                    }
                    // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                    if(extraAddr !== ''){
                        extraAddr = ' (' + extraAddr + ')';
                    }
                    // 조합된 참고항목을 해당 필드에 넣는다.
                    document.getElementById("detail_address").value = extraAddr;
                
                } else {
                    document.getElementById("detail_address").value = '';
                }

                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                document.getElementById('postal').value = data.zonecode;
                document.getElementById("address").value = addr;
                // 커서를 상세주소 필드로 이동한다.
                document.getElementById("detail_address").focus();
            }
        }).open();
    }
</script>
</body>

</html>
