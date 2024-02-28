function createCard(element){

    const link = document.createElement('a');
    link.href = element.link;
    link.target = "_blank";
    link.className = "link-offset-2 link-underline link-underline-opacity-0";

    const col = document.createElement("div");
    col.className = "col";
    
    const card = document.createElement("div");
    card.className = "card";

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
    link.appendChild(card);
    return link;
}

function createTable(element){
    
    const tr = document.createElement("tr");
    const th = document.createElement("th");
    th.scope = "row";
    th.textContent = element.id;

    const td_title = document.createElement("td");
    td_title.textContent = element.title;
    const td_source = document.createElement("td");
    td_source.textContent = element.source;


    tr.appendChild(th);
    tr.appendChild(td_title);
    tr.appendChild(td_source);
    return tr;



}



function shuffle(array) {
    array.sort(() => Math.random() - 0.5);
  }