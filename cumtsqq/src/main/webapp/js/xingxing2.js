function submit_a(){
	    //获取用户输入的值
       
        var logistics=document.getElementById('logistics').innerText;
        var quality=document.getElementById('quality').innerText;
        var server=document.getElementById('server').innerText;
        var good_id=document.getElementById('good_id').innerText;
        
	    //拼接url
	    var url = "comment?";
	    url += "logistics="+logistics+"&quality="+quality+"&server="+server+"&good_id="+good_id;
	    //重新定位url
	    window.location = url;
	}