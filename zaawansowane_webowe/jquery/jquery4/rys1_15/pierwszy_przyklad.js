$(function () {

    $('input').on('keydown', function() {
        $('input').css({
            'background-color': 'black',
            'color': 'white'
        });
    });

    $('input').on('keyup', function() {
        $('input').css({
            'background-color': 'white',
            'color': 'black'
        });
    });

    let i = 0;
    $('input').keypress(function() {
        $('span').text(i += 1);
    });
});