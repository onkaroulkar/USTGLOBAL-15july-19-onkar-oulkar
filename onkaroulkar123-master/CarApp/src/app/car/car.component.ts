import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-car',
  templateUrl: './car.component.html',
  styleUrls: ['./car.component.css']
})
export class CarComponent implements OnInit {

  constructor() { }

  carData: any='';

  cars=[
    { brand:'BMW',
    img:'https://cdn.pixabay.com/photo/2015/09/02/12/25/bmw-918408__340.jpg',
    description:'BMW is a German multinational company which produces automobiles and motorcycles. The company was founded in 1916 as a manufacturer of aircraft engines, which it produced from 1917 until 1918 and again from 1933 to 1945.'
  },
  {
    brand:'Mercedes',
    img:'https://cdn.pixabay.com/photo/2017/03/27/14/56/auto-2179220__340.jpg',
    description:'Mercedes-Benz is a German global automobile marque and a division of Daimler AG. The brand is known for luxury vehicles, buses, coaches, and trucks. The headquarters is in Stuttgart, Baden-Württemberg. The name first appeared in 1926 under Daimler-Benz. '
  },
  { brand:'Porsche',
    img:'https://cdn.pixabay.com/photo/2018/04/22/17/22/porsche-911-3341697__340.jpg',
    description:'Dr.-Ing. h.c. F. Porsche AG, usually shortened to Porsche AG, is a German automobile manufacturer specializing in high-performance sports cars, SUVs and sedans. Porsche AG is headquartered in Stuttgart, and is owned by Volkswagen AG, which is itself majority-owned by Porsche Automobil Holding SE.'},
  {
  brand:'Audi',
  img:'https://cdn.pixabay.com/photo/2015/01/19/13/51/car-604019__340.jpg',
  description:'Audi AG is a German automobile manufacturer that designs, engineers, produces, markets and distributes luxury vehicles. Audi is a member of the Volkswagen Group and has its roots at Ingolstadt, Bavaria, Germany. Audi-branded vehicles are produced in nine production facilities worldwide. '
  },
  {
    brand:'Jaguar',
    img:'https://cdn.pixabay.com/photo/2016/04/09/08/45/sports-car-1317645__340.jpg',
    description:'Jaguar is the luxury vehicle brand of Jaguar Land Rover, a British multinational car manufacturer with its headquarters in Whitley, Coventry, England.'
    },
    {
      brand:'Ferrari',
      img:'https://cdn.pixabay.com/photo/2015/07/17/14/13/ferrari-california-849305__340.jpg',
      description:'Ferrari is an Italian luxury sports car manufacturer based in Maranello. Founded by Enzo Ferrari in 1939 out of Alfa Romeos race division as Auto Avio Costruzioni, the company built its first car in 1940.'
      },
      {
        brand:'Rolls-Royce',
        img:'https://cdn.pixabay.com/photo/2017/11/12/20/03/rolls-royce-2943640__340.jpg',
        description:'Rolls-Royce Motor Cars Limited is a British luxury automobile maker. A wholly owned subsidiary of German group BMW, it was established in 1998 after BMW was licensed the rights to the Rolls-Royce brand name and logo from Rolls-Royce plc and acquired the rights to the Spirit of Ecstasy and Rolls-Royce grill shape trademarks from Volkswagen AG. Rolls-Royce Motor Cars Limited operates from purpose-built administrative and production facilities opened in 2003 across from the historic Goodwood Circuit in Goodwood, West Sussex, England, United Kingdom. Rolls-Royce Motors Cars Limited is the exclusive manufacturer of Rolls-Royce branded motor cars since 2003.'
        },
        {
          brand:'Lamborghini',
          img:'https://cdn.pixabay.com/photo/2016/11/12/14/32/lamborghini-1818897__340.jpg',
          description:'Automobili Lamborghini S.p.A. is an Italian brand and manufacturer of luxury sports cars and SUVs based in Sant Agata Bolognese and tractors Lamborghini Trattori in Pieve di Cento, Italy. The company is owned by the Volkswagen Group through its subsidiary Audi.'
          },
          {
            brand:'Tesla',
            img:'https://cdn.pixabay.com/photo/2019/07/13/22/03/its-4335837__340.jpg',
            description:'Tesla, Inc. (formerly Tesla Motors, Inc.) is an American automotive and energy company based in Palo Alto, California. The company specializes in electric car manufacturing and, through its SolarCity subsidiary, solar panel manufacturing. It operates multiple production and assembly plants, notably Gigafactory 1 near Reno, Nevada, and its main vehicle manufacturing facility at Tesla Factory in Fremont, California. As of March 2019, Tesla sells the Model S, Model X, and Model 3 automobiles. It is accepting reservations for the Model Y, Roadster (2020), and Semi vehicles. Tesla also sells Powerwall, Powerpack, and Megapack batteries, solar panels, solar roof tiles, and some related products.'},
            {
              brand:'Cadillac',
              img:'https://cdn.pixabay.com/photo/2014/07/10/08/08/car-388866__340.jpg',
              description:'Cadillac is a division of the American automobile manufacturer General Motors (GM) that designs and builds luxury vehicles. Its major markets are the United States, Canada, and China. Cadillac vehicles are distributed in 34 additional markets worldwide. Cadillac automobiles are at the top of the luxury field within the United States. In 2017, Cadillacs U.S. sales were 156,440 vehicles and its global sales were 356,467 vehicles.'}

  ]
  
  sendCar(car){
  this.carData=car;
  }
  ngOnInit() {
  }

}
