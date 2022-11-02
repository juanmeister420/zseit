$(function () {
    let i = 0;
    let n = 0;
    $('#tekst').on('scroll', function() {
        $('span').eq(0).text(i += 1);
    });

    $(window).on('resize', function() {
        $('span').eq(1).text(n += 1);
    });
});