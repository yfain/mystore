import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { FooterComponent } from './footer/footer.component';
import { NavbarComponent } from './navbar/navbar.component';
import { ProductItemComponent } from './product-item/product-item.component';
import { ProductDetailComponent } from './product-detail/product-detail.component';
import { SearchComponent } from './search/search.component';
import {RouterModule} from "@angular/router";
import {FormsModule} from '@angular/forms';
import { ProductService } from './shared/product.service';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    FooterComponent,
    NavbarComponent,
    ProductItemComponent,
    ProductDetailComponent,
    SearchComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    RouterModule.forRoot([
      {path: '',                    component: HomeComponent},
      {path: 'products/:productId', component: ProductDetailComponent}
    ]),
  ],
  providers: [ProductService],
  bootstrap: [AppComponent]
})
export class AppModule { }
