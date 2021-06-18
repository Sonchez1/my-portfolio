async function showText() {
  const responseFromServer = await fetch('/hello');
  const textFromResponse = await responseFromServer.text();

  const textContainer = document.getElementById('text-container');
  textContainer.innerText = textFromResponse;
}