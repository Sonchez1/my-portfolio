async function showText() {
  const responseFromServer = await fetch('/hello');
  const textFromResponse = await responseFromServer.json();

  

  const textContainer = document.getElementById('text-container');
  textContainer.innerText = textFromResponse[Math.floor(Math.random() * 3)];
}