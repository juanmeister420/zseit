const fs = require("fs");
const path = require("path");
const axios = require("axios");
const cheerio = require("cheerio");

const url = "https://www.wprost.pl/polityka";
const outputDir = path.join(__dirname, "output");

const getArticles = async () => {
  const { data } = await axios.get(url);
  const $ = cheerio.load(data);

  //   create array with items from #main-list strong span
  const articles_data = $("#main-list li")
    .map((i, el) => {
        let title =  $(el).find("strong span").text();
        let description = $(el).find(".news-lead i").text();
        let date = $(el).find(".news-date").attr("title");
        if (title && description) {
            return {
                title,
                description,
                date,
            };
        }

    })
    .get();


  console.log(articles_data);

  //   return articles;
};

getArticles();
