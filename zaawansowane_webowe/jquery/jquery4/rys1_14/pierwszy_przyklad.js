$(function () {

    let i = 0;
    let n = 0;
    $('#wew').mouseover(function() {
        i += 1;
        $('#komunikat').text('Najechano na prostokąt ' + i + ' razy');
    }).mouseout(function() {
        $('#komunikat').text('Opuszczono obszar prostokąta');
    });

    $('#wew').click(function() {
        n += 1;
        $('#komunikat').text('Kliknięto prostokąt ' + n + ' razy');
    });
});