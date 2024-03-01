/*!
* Start Bootstrap - Shop Homepage v5.0.6 (https://startbootstrap.com/template/shop-homepage)
* Copyright 2013-2023 Start Bootstrap
* Licensed under MIT (https://github.com/StartBootstrap/startbootstrap-shop-homepage/blob/master/LICENSE)
*/
// This file is intentionally blank
// Use this file to add JavaScript to your project


function create_card_element(element){

    const link = document.createElement('a');
    link.href = element.link;
    link.target = "_blank";
    link.className = "link-offset-2 link-offset-3-hover link-underline link-underline-opacity-0 link-underline-opacity-75-hover";


    const card_title = document.createElement("h5");
    card_title.className = "fw-bolder text-center";
    card_title.textContent = element.title; 

    const card_div_body_text = document.createElement("div");
    card_div_body_text.className = "text-center text-truncate-container";
    card_div_body_text.textContent = element.description;
    
    const card_source = document.createElement("p");
    card_source.textContent = element.idSource; 

    const card_div_body = document.createElement("div");
    card_div_body.className = "card-body p-4";
    card_div_body.appendChild(card_source);
    card_div_body.appendChild(card_title);
    card_div_body.appendChild(card_div_body_text);

    const card_img = document.createElement("img");
    card_img.className = "card-img-top";
    card_img.src = element.media;
    card_img.alt = "...";

    const card_div = document.createElement("div");
    card_div.className = "card h-100";
    card_div.appendChild(card_img);
    card_div.appendChild(card_div_body);

    const div_col_mb = document.createElement("div");
    div_col_mb.className = "col mb-5";
    div_col_mb.appendChild(card_div);

    return div_col_mb;
}