$(document).ready(function() {
    $.ajax({
        url: "/categories"
    }).then(function(data) {
    	$.each(data, function(i, item) {
    		$('.categoryName').append(item.name);
    	})
    });
});
