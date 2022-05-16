const minValue = 0;
const maxValue = 9;
let answerChoices = [];
let number1;
let number2;
let answer;

function getRandomNumber(max) {
    return Math.floor(Math.random() * Math.floor(max));
}

function shuffleArray(arr) {
    return arr.sort(function (a, b) { return Math.random() - 0.5 })
}

function generateProblem() {
    number1 = getRandomNumber(maxValue)
    number2 = getRandomNumber(maxValue)
    answer = number1 * number2

    const expression = document.querySelector('.expression')
    expression.innerText = `${number1} * ${number2}`
    
    answerChoices = [answer, getRandomNumber(100), getRandomNumber(100), getRandomNumber(100)];
    shuffleArray(answerChoices)
}

function populateAnswers() {
    const answers = document.querySelectorAll('li')
    for (let i = 0; i < answerChoices.length; i++) {
        answers[i].innerText = answerChoices[i]
    }
}

document.addEventListener('DOMContentLoaded', () => {
    generateProblem()
    populateAnswers()

})