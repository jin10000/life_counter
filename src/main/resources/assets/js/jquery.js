const searchNewsEvent = function(){
    let media = "daum";
    let start_date = $("start-date").get
    let end_date = $("end-date").val();
    let news_count = $("news_count").val();
    //alert(start_date);
    let url = "/";
    location.href = url;
}

$(document).ready(function(){
	$("#filter-search-btn").click(searchNewsEvent());

});
