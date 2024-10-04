// Seleziona gli elementi
var popup = document.getElementById("popup");
var popupImage = document.getElementById("popupImage");
var mainImage = document.getElementById("mainImage");
var closeBtn = document.getElementById("close");
var bodyContent = document.body;

mainImage.onclick = function() {
    popup.style.display = "flex";
    popupImage.src = this.src;
}

closeBtn.onclick = function() {
    popup.style.display = "none";
}

popup.onclick = function(event) {
    if (event.target == popup) {
        popup.style.display = "none";
    }
}
