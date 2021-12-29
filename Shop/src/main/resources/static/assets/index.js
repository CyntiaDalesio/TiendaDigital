/*redirect login button*/
let login = document.getElementById("signIn");
login.addEventListener("click", () => {
    location.href = "/login";
})

/*reditect to home page*/
let home = document.querySelectorAll("#home");
home.forEach((item) => {
    item.addEventListener("click", () => {
        location.href = "/";
    })
})

let buttonsModify = document.querySelectorAll(".modify");

buttonsModify.forEach((button) => {
    button.addEventListener("click", () => {
        location.href = "/product";
    })
})