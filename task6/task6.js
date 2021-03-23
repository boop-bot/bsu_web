
let adList = [
    {
        id: "1",
        description: "Аквапарк \"Фристайл\": аквазона от 15 руб/3 часа, аквазона + 6 бань от 35 руб/до 6 часов",
        createdAt: new Date("2021-03-15T23:00:00"),
        link: "https://www.free-style.by/",
        vendor:"Аквапарк \"Фристайл\"",
        photoLink: "https://www.free-style.by/assets/img/akvapark/photo/%D0%9E%D0%BD%D0%BB%D0%B0%D0%B9%D0%BD%D0%B5%D1%80%20%D0%92%D0%BB%D0%B0%D0%B4%20%D0%91%D0%BE%D1%80%D0%B8%D1%81%D0%B5%D0%B2%D0%B8%D1%87%20(26)-min.jpg",
        validUntil: new Date("2021-06-01T23:00:00"),
        discount: "30%",
        rating: 4.1,
        hashTags: ["Развлечения", "Аквапарки", "Бассейны", "Спорт", "Здоровье"]
    },
    {
        id: "2",
        description: "Боулинг в клубе НЛО всего от 10 руб/час",
        createdAt: new Date("2021-02-15T23:00:00"),
        link: "http://www.nlo.by/",
        vendor: "Боулинг \"НЛО\"",
        photoLink: "http://www.nlo.by/tim.php?src=images/1431501458.jpg&h=255&w=550",
        validUntil: new Date("2021-04-01T23:00:00"),
        discount: "15%",
        rating: 3.9,
        hashTags: ["Развлечения", "Боулинг"]
    },
    {
        id: "3",
        description: "Посещение зоопарка в Чижовке всего за 4,50 руб/билет",
        createdAt: new Date("2021-03-10T23:00:00"),
        link: "http://minskzoo.by/",
        vendor: "ГКПУ \"Минский зоопарк\"",
        photoLink: "http://minskzoo.by/images/slideshow/1%20.jpg",
        validUntil: new Date("2021-04-10T23:00:00"),
        discount: "50%",
        rating: 4.9,
        hashTags: ["Развлечения", "Зоопарк", "Детям"]
    },
    {
        id: "4",
        description: "Квесты \"Братство масонов\" и \"Вестерн: Однажды в Аризоне\" от 29 руб/до 6 человек. Подарочные сертификаты от 50 руб.",
        createdAt: new Date("2021-01-15T23:00:00"),
        link: "https://pinkertonquest.by/",
        vendor: "Пинкертон",
        photoLink: "https://www.slivki.by/znijki-media/w522_322/default/1009921/kvest-pinkertonquest.jpg",
        validUntil: new Date("2021-10-01T23:00:00"),
        discount: "52%",
        rating: 4.9,
        hashTags: ["Развлечения", "Квесты"]
    },
    {
        id: "5",
        description: "Посещение музея экспериментальных наук \"Экспириментус\" от 6 руб/билет в ТРЦ \"Palazzo\"",
        createdAt: new Date("2021-03-20T23:00:00"),
        link: "https://expo.expirimentus.by/",
        vendor: "Экспириментус",
        photoLink: "https://expo.expirimentus.by/img/gallery/02.jpg",
        validUntil: new Date("2021-06-29T23:00:00"),
        discount: "40%",
        rating: 4.8,
        hashTags: ["Развлечения", "Выставки"]
    },
    {
        id: "6",
        description: "Конные прогулки по живописным местам от 12,50 руб. в конно-спортивном клубе \"Тракенен\"",
        createdAt: new Date("2020-03-15T23:00:00"),
        link: "https://mssg.me/ksk_trakenen",
        vendor: "ИП Байталюк Ю.В.",
        photoLink: "https://www.slivki.by/ximage/1594731376_mceclip15.jpg",
        validUntil: new Date("2022-06-01T23:00:00"),
        discount: "45%",
        rating: 5.0,
        hashTags: ["Развлечения", "Прогулка верхом", "Детям"]
    },
    {
        id: "7",
        description: "Сеть батутных центров \"Hero Park\" в Минске от 5,50 руб/60 минут",
        createdAt: new Date("2021-03-01T23:00:00"),
        link: "http://heropark.by/index.html",
        vendor: "Hero park",
        photoLink: "https://heropark.by/wp-content/uploads/2019/01/fitnes_dlay_fzroslih_gallery_3.jpg",
        validUntil: new Date("2021-06-30T23:00:00"),
        discount: "40%",
        rating: 4.7,
        hashTags: ["Развлечения", "Батуты", "Детям"]
    },
    {
        id: "8",
        description: "Суши-сеты от 14 руб/от 440 г от \"ЮДЖЫН КРАБС\" с бесплатной доставкой",
        createdAt: new Date("2021-01-22T23:00:00"),
        link: "https://ucrabs.by/",
        vendor: "Юджин Крабс суши доставка",
        photoLink: "https://ucrabs.by/image/cache/catalog/catalog/seti/kupidon-2-1600x1600.jpg",
        validUntil: new Date("2021-11-11T23:00:00"),
        discount: "33%",
        rating: 4.8,
        hashTags: ["Еда", "Суши"]
    },
    {
        id: "9",
        description: "Пиццы 22, 30 и 36 см Domino’s Pizza от 9,29 руб. в ресторане + доставка + навынос!",
        createdAt: new Date("2021-02-22T23:00:00"),
        link: "https://dominos.by/",
        vendor: "Domino’s Pizza",
        photoLink: "https://images.dominos.by/media/uploads/2020/11/18/__852432-min.png",
        validUntil: new Date("2022-12-12T23:00:00"),
        discount: "44%",
        rating: 4.4,
        hashTags: ["Еда", "Пицца"]
    },
    {
        id: "10",
        description: "KFC -50%: 3 комбо на выбор от 11,30 руб.",
        createdAt: new Date("2021-01-01T23:00:00"),
        link: "https://www.kfc.by/",
        vendor: "KFC",
        photoLink: "https://statickfc.cdnvideo.ru/promotions/medium/promo_3650_1405074669.jpg",
        validUntil: new Date("2021-04-01T23:00:00"),
        discount: "30%",
        rating: 4.5,
        hashTags: ["Еда", "Бургеры"]
    },
    {
        id: "11",
        description: "Закуски, горячие блюда для двоих от 11 руб, роллы за 5,60 руб. в баре \"Пиранья\"",
        createdAt: new Date("2015-03-15T23:00:00"),
        link: "https://piranya.by/",
        vendor: "бар \"Пиранья\"",
        photoLink: "https://piranya.by/sites/default/files/logo_novy_1.png",
        validUntil: new Date("2025-06-01T23:00:00"),
        discount: "25%",
        rating: 4.0,
        hashTags: ["Еда", "Бары", "Алкоголь"]
    },
    {
        id: "12",
        description: "\"Штолле\": пироги с доставкой или навынос со скидкой 30%",
        createdAt: new Date("2021-03-11T23:00:00"),
        link: "http://stolle.by/",
        vendor: "Штолле",
        photoLink: "https://stolle.by/images/slider_pirogi_nedeli_vish.JPG",
        validUntil: new Date("2025-04-11T23:00:00"),
        discount: "40%",
        rating: 4.3,
        hashTags: ["Еда", "Пироги"]
    },
    {
        id: "13",
        description: "Безлимитный абонемент на месяц всего за 42,50 руб. в тренажерном зале \"Адреналин\"",
        createdAt: new Date("2020-02-02T23:00:00"),
        link: "https://pbd.adrenalin-fitness.by/",
        vendor: "тренажерный зал \"Адреналин\"",
        photoLink: "https://adrenalin-fitness.by/assets/template/img/shust/team2.jpg",
        validUntil: new Date("2022-02-02T23:00:00"),
        discount: "50%",
        rating: 4.5,
        hashTags: ["Здоровье", "Спорт"]
    },
    {
        id: "14",
        description: "16 видов УЗИ от 8,50 руб. в медцентре \"Ф-Клиник\"",
        createdAt: new Date("2021-03-03T23:00:00"),
        link: "http://www.f-clinic.by/",
        vendor: "ООО \"Ф-КЛИНИК\"",
        photoLink: "https://www.f-clinic.by/gallery/%D0%A1%D0%BD%D0%B8%D0%BC%D0%BE%D0%BA%20%D1%8D%D0%BA%D1%80%D0%B0%D0%BD%D0%B0%202020-10-27%20%D0%B2%2020.07.52-ts1603838782.png",
        validUntil: new Date("2021-04-03T23:00:00"),
        discount: "40%",
        rating: 4.3,
        hashTags: ["Здоровье", "УЗИ", "Медцентры"]
    },
    {
        id: "15",
        description: "Профессиональный шиномонтаж 2-4 колес от ПротекторМинск",
        createdAt: new Date("2021-03-15T20:00:00"),
        link: "http://protectorminsk.by/",
        vendor: "ПротекторМинск",
        photoLink: "http://protectorminsk.by/images/tyre_service.jpg",
        validUntil: new Date("2021-06-01T22:00:00"),
        discount: "35%",
        rating: 4.4,
        hashTags: ["Авто", "Шиномонтаж"]
    },
    {
        id: "16",
        description: "Мужская стрижка, коррекция (стрижка) бороды, тонирование седины и бороды от 10 руб. в \"Buro 20/16\"",
        createdAt: new Date("2021-01-02T23:00:00"),
        link: "http://buroone.by/",
        vendor: "BURO",
        photoLink: "https://buroone.by/images/gallery-1.jpg",
        validUntil: new Date("2022-01-01T23:00:00"),
        discount: "40%",
        rating: 3.8,
        hashTags: ["Здоровье", "Красота", "Салоны красоты"]
    },
    {
        id: "17",
        description: "Мойка авто всего от 5 руб, комплексная мойка от 9 руб, комплекс \"Элитный\" 16 руб. в автомойке \"Автопрачка\"",
        createdAt: new Date("2020-01-01T23:00:00"),
        link: "https://megaservice.by/",
        vendor: "МЕГАСЕРВИС",
        photoLink: "https://www.slivki.by/znijki-media/w522_322/default/1009921/rosinka-moika-khimchistka-3.jpg",
        validUntil: new Date("2023-06-01T23:00:00"),
        discount: "20%",
        rating: 3.5,
        hashTags: ["Авто", "Автомойка"]
    },
    {
        id: "18",
        description: "29-31 марта дневные шоу в дельфинарии \"Немо\" за 12,50 руб.",
        createdAt: new Date("2019-01-11T23:00:00"),
        link: "http://nemominsk.com/",
        vendor: "NEMO MINSK",
        photoLink: "http://nemominsk.com/images/slider/nemo-summer-20-minsk-950x250.jpg",
        validUntil: new Date("2025-06-01T23:00:00"),
        discount: "60%",
        rating: 4.4,
        hashTags: ["Развлечения", "Дельфинарий", "Детям"]
    },
    {
        id: "19",
        description: "Стоматология для детей и взрослых, консультация врача бесплатно (0 руб), профгигиена -50% в медцентре \"Медицинская инициатива\"",
        createdAt: new Date("2021-01-13T20:00:00"),
        link: "http://www.inicia.by/",
        vendor: "Медицинская инициатива",
        photoLink: "https://www.inicia.by/images/services/HIRURG.png",
        validUntil: new Date("2021-12-12T23:00:00"),
        discount: "25%",
        rating: 4.4,
        hashTags: ["Здоровье", "Красота", "Стоматология", "Детям"]
    },
    {
        id: "20",
        description: "Картинг за 10 руб. в \"F1-Картинг\"",
        createdAt: new Date("2020-01-15T23:00:00"),
        link: "https://karting-club.by/",
        vendor: "F1-Картинг Минск",
        photoLink: "https://karting-club.by/plugins/content/jw_sigpro/jw_sigpro/includes/images/transparent.gif",
        validUntil: new Date("2024-01-01T12:00:00"),
        discount: "50%",
        rating: 4.9,
        hashTags: ["Развлечения", "Картинг"]
    },
    ]

// functions

let getAd = (function(id){
    return adList.find((ad)=>ad['id'] === id);
});

let validateAd = (function(ad){
    let today = new Date();
    const REGEX_ID = /\d+/;
    const REGEX_DESCRIPTION = /.{1,300}/;

    if (typeof(ad.id) === "string" && ad.id.match(REGEX_ID) &&
        typeof(ad.description) === "string" && ad.description.match(REGEX_DESCRIPTION) &&
        ad.createdAt instanceof Date && ad.createdAt < today &&
        typeof(ad.link) === "string" && ad.link.length !== 0 &&
        typeof(ad.vendor) === "string" && ad.vendor.length !== 0 &&
        typeof(ad.photoLink) === "string" && ad.photoLink.length !== 0 &&
        ad.validUntil instanceof Date && ad.validUntil > today &&
        ad.hashTags instanceof Array && ad.hashTags.every((hashTag)=> typeof(hashTag) === "string") &&
        typeof(ad.discount) === "string" &&  ad.discount.length != 0 &&
        typeof(ad.rating) === "number") {

        return true;
    } else {
        return false;
    }
});

let addAd = (function(ad){
    if (getAd(ad["id"]) !== undefined) {
        return false;
    }

    if (validateAd(ad)) {
        adList.push(ad);
        return true;
    } else{
        return false;
    }
});

let removeAd = (function(id){
    let index = adList.findIndex((item)=> item["id"] === id);
    if (index === -1) {
        return false;
    }
    adList.splice(index,1);
    return true;
});

let editAd = (function(id, adItem){
    //checking forbidden keys
    let keys = Object.keys(adItem);
    if (keys.includes("id") || keys.includes("vendor") || keys.includes("createdAt")) {
        return false;
    }
    // finding add
    let index = adList.findIndex((item)=> item["id"] === id);
    if (index === -1) {
        return false;
    }
    let updatedAd = adList[index];
    // updating
    keys.forEach((key)=>updatedAd[key] = adItem[key]);
    // validating
    if (validateAd(updatedAd)) {
        adList[index] = updatedAd;
        return true;
    } else {
        return false;
    }
});

let getAds = (function(skip = 0, top = 10, filterConfig = {}){
    let foundAds = [];
    let key = Object.keys(filterConfig);

    if (key.length == 0){ // default date filter
        let timeSortedAds = adList.slice().sort((adItem1, adItem2) => adItem1["createdAt"].getTime() - adItem2["createdAt"].getTime());
        foundAds.push(timeSortedAds.slice(skip, top));
    } else if (key[0] === "hashTags") { // hashTags filter
        let hashTags = filterConfig[[key[0]]];
        let hashTagsAds = adList.filter((adItem)=> hashTags.some((hashTag)=>adItem["hashTags"].includes(hashTag)));
        hashTagsAds.sort((adItem1, adItem2) => adItem1["createdAt"].getTime() - adItem2["createdAt"].getTime());
        foundAds.push(hashTagsAds.slice(skip, top));
    } else if (key[0] === "vendors") { // vendors filter
        let vendors = filterConfig[[key[0]]];
        let vendorsAds = adList.filter((adItem)=> vendors.includes(adItem["vendor"]));
        vendorsAds.sort((adItem1, adItem2) => adItem1["createdAt"].getTime() - adItem2["createdAt"].getTime());
        foundAds.push(vendorsAds.slice(skip, top));
    }
    return foundAds;
});

// tests

// getAds()
console.log("Default getAds()");
console.log(getAds());
console.log("getAds() with right parameters");
console.log(getAds(10, 20));
console.log("getAds() with wrong parameters");
console.log(getAds(50, 30));
console.log("getAds() with hash tag filter")
console.log(getAds(2 , 5, {hashTags: ["Еда"]}));
console.log("getAds() with vendor filter")
console.log(getAds(0 , 10, {vendors: ["Штолле", "BURO"]}));

// getAd()
console.log("right getAd()");
console.log(getAd("5"));
console.log("wrong getAd()");
console.log(getAd("0"));

// validateAd()
console.log("true validateAd()");
console.log(validateAd({
    id: "5",
    description: "Скидка на стулья - до 15%",
    createdAt: new Date("2021-03-15T23:00:00"),
    link: "https://coolchairs.com",
    vendor: "Chair Service",
    photoLink: "https://images.app.goo.gl/dgAFyP2cEduzkJUP9",
    validUntil: new Date("2021-06-01T23:00:00"),
    discount: "15%",
    hashTags: ["furniture", "chairs"],
    rating: 5.0
}));

console.log("false validateAd()");
console.log(validateAd({
    id: "fv", // wrong id
    description: "Скидка на стулья - до 15%",
    createdAt: new Date("2021-03-15T23:00:00"),
    link: "https://coolchairs.com",
    vendor: "Chair Service",
    photoLink: "https://images.app.goo.gl/dgAFyP2cEduzkJUP9",
    validUntil: new Date("2021-06-01T23:00:00"),
    discount: "15%",
    hashTags: ["furniture", "chairs"],
    rating: 5.0
}));

console.log("false validateAd()");
console.log(validateAd({
    id: "5",
    description: "Скидка на стулья - до 15%",
    createdAt: new Date("2021-03-15T23:00:00"),
    link: "https://coolchairs.com",
    vendor: "Chair Service",
    photoLink: "https://images.app.goo.gl/dgAFyP2cEduzkJUP9",
    validUntil: new Date("2021-06-01T23:00:00"),
    discount: "15%",
    hashTags: ["furniture", 5.0], // wrong hasTags array
    rating: 5.0
}));

// addAd()

console.log("true addAd()");
console.log(addAd({
    id: "5",
    description: "Скидка на стулья - до 15%",
    createdAt: new Date("2021-03-15T23:00:00"),
    link: "https://coolchairs.com",
    vendor: "Chair Service",
    photoLink: "https://images.app.goo.gl/dgAFyP2cEduzkJUP9",
    validUntil: new Date("2021-06-01T23:00:00"),
    discount: "15%",
    hashTags: ["furniture", "chairs"],
    rating: 5.0
}));

console.log("false addAd()"); // already exists
console.log(addAd({
    id: "13",
    description: "Безлимитный абонемент на месяц всего за 42,50 руб. в тренажерном зале \"Адреналин\"",
    createdAt: new Date("2020-02-02T23:00:00"),
    link: "https://pbd.adrenalin-fitness.by/",
    vendor: "тренажерный зал \"Адреналин\"",
    photoLink: "https://adrenalin-fitness.by/assets/template/img/shust/team2.jpg",
    validUntil: new Date("2022-02-02T23:00:00"),
    discount: "50%",
    rating: 4.5,
    hashTags: ["Здоровье", "Спорт"]
}));

console.log("false addAd()"); // wrong validation (wrong id)
console.log(addAd({
    id: "dcsd", //wrong id
    description: "Скидка на стулья - до 15%",
    createdAt: new Date("2021-03-15T23:00:00"),
    link: "https://coolchairs.com",
    vendor: "Chair Service",
    photoLink: "https://images.app.goo.gl/dgAFyP2cEduzkJUP9",
    validUntil: new Date("021-06-01T23:00:00"),
    discount: "15%",
    hashTags: ["furniture", "chairs"],
    rating: 5.0
}));

// editAd()

console.log("true editAd()");
console.log(editAd("1", {discount: "100%"}));
console.log("false editAd()"); //wrong id
console.log(editAd("100", {discount: "100%"}));
console.log("false editAd()"); //forbidden key vendor
console.log(editAd("1", {vendor: "Alibaba"}));
console.log("false editAd()"); //forbidden key createdAd
console.log(editAd("1", {createdAt: "021-06-01T23:00:00"}));
console.log("true editAd()");
console.log(editAd("10", {discount: "100%", photoLink: "photo.com"}));

// removeAd()

console.log("true removeAd()");
console.log(removeAd("1"));
console.log("false removeAd()");
console.log(removeAd("100")); // wrong index