function createCard(element){

    const col = document.createElement("div");
    col.className = "col";
    
    const card = document.createElement("div");
    card.className = "card h-100";

    const card_body = document.createElement('div');
    card_body.className = "card-body";

    const card_title = document.createElement('h5');
    card_title.className = "card-title"
    card_title.textContent = element.title;

    const card_text = document.createElement('p');
    card_text.className = "card-text";
    card_text.textContent = element.source;
    
    card_body.appendChild(card_title);
    card_body.appendChild(card_text);
    card.appendChild(card_body);
    col.appendChild(card);

    return col;
}