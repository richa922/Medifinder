$(function(){
                $(".dropdown").hover(            
                function() {
                $('.dropdown-menu', this).stop( true, true ).fadeIn("slow");
                $(this).toggleClass('open');
                $('b', this).toggleClass("caret caret-up");                
                },
function() {
            $('.dropdown-menu', this).stop( true, true ).fadeOut("slow");
            $(this).toggleClass('open');
            $('b', this).toggleClass("caret caret-up");                
            });
            }
);