/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function pagger(id, pageindex, totalpage, url)
{
    container = document.getElementById(id);
    var result = '';
    result += 'Page:<input id="pageindex_input" type="text" value="' + pageindex + '"/> over ' + totalpage;
    container.innerHTML = result;

    // Get the input field
    var input = document.getElementById("pageindex_input");

    // Execute a function when the user releases a key on the keyboard
    input.addEventListener("keyup", function (event) {
        // Number 13 is the "Enter" key on the keyboard
        if (event.keyCode === 13) {
            window.location.href = '' + url + '?page=' + input.value;
        }
    });
}
function paggerClick(id, pageindex, totalpage, url, gap, keyWord) {
    container = document.getElementById(id);
    var result = '';

    if (pageindex - gap > 1) {

        result += '<a href="' + url + 'page=1'

        result += '&keyWord=A"'


        result += '>Fisrt</a>'
    }
    for (var i = pageindex - gap; i < pageindex; i++) {
        if (i >= 1) {

            result += '<a href="' + url + 'page=' + i + ''
            if (keyWord != null) {

                result += '&keyWord=' + keyWord + ''
            }

            result += '">' + i + '</a>'
        }

    }
    result += '<span>' + pageindex + '</span>'

    for (var i = pageindex + 1; i <= pageindex + gap; i++) {

        if (i <= totalpage) {

            result += '<a href="' + url + 'page=' + i + ''
            if (keyWord != null) {

                result += '&keyWord=' + keyWord + ''
            }
            result += '">' + i + '</a>'
        }

    }

    if (pageindex + gap < totalpage) {

        result += '<a href="' + url + 'page=' + totalpage + '&keyWord=A" >Last</a>'

    }

    container.innerHTML = result;

}

