import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Product} from './product';

@Injectable()
export class RealProductService {

  constructor(private httpClient: HttpClient) { }

 // I'm subscribing inside the method to simplify the demo
 // A better solution is to return an observable and subscribe in the component
  getProducts():Product[]{

     let products:Product[] = [];

     this.httpClient.get<Product[]>("/api/products")
       .subscribe(
         data => products.push(...data),
              err => console.log(err)
       );

     return products;
  }

  getProductById(productId: number): Product {

    let product:Product =<any>{};

    this.httpClient.get<Product>(`/api/products/${productId}`)
      .subscribe(
        data => Object.assign(product, data),
        err => console.log(err)
      );

    return product;
  }

}
