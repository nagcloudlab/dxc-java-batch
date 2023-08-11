console.log("-index.js-")


// DOM API

const cardBody = document.querySelector(".card-body");
const greetBtn = document.querySelector(".btn-primary");
const changeColorBtn = document.querySelector(".btn-warning");

greetBtn.addEventListener("click", () => {
    cardBody.innerText = "good noon"
});
changeColorBtn.addEventListener("click", () => {
    cardBody.style.color = "tomato";
});


//--------------------------------------

const top5TodosBtn = document.querySelector("#top-5-todos-btn");
const todosBody = document.querySelector("#todos-body")
top5TodosBtn.addEventListener("click", () => {
    // XHR or Fetch API
    const promise = fetch("https://jsonplaceholder.typicode.com/todos?_limit=5")
    promise
        .then(response => response.json())
        .then(todos => {
            const rows = todos.map(todo => {
                return `
                    <tr>
                        <td>${todo.id}</td>
                        <td>${todo.title}</td>
                        <td>${todo.completed}</td>
                    </tr>
                `
            })
            todosBody.innerHTML = rows.join("")
        });
});

// ----------------------------------------------------------------