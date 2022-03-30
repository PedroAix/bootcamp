import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CalculadoraComponent } from './calculadora/calculadora.component';
import { ContactosAddComponent, ContactosComponent, ContactosEditComponent, ContactosListComponent, ContactosViewComponent } from './contactos';
import { DemosComponent } from './demos/demos.component';
import { HomeComponent, PageNotFoundComponent } from './main';

const routes: Routes = [
  { path: '', pathMatch: 'full', component: HomeComponent },
  { path: 'inicio', component: HomeComponent },
  { path: 'demos', component: DemosComponent },
  { path: 'chisme/de/hacer/numeros', component: CalculadoraComponent },
  { path: 'contactos', component: ContactosListComponent },
  { path: 'contactos/add', component: ContactosAddComponent },//El más específico primero
  { path: 'contactos/:id', component: ContactosViewComponent },//Este es menos especifico que el anterior porque en el id puede venir cualquier cosa
  { path: 'contactos/:id/edit', component: ContactosEditComponent },
  { path: 'contactos/:id/:kk', component: ContactosViewComponent },
  { path: 'alisha/passion', redirectTo: '/contactos/9' },

  //MEJOR FORMA DE HACERLO
  { path: 'libros', children: [
    { path: '', component: HomeComponent },
    { path: 'add', component: ContactosAddComponent },
    { path: ':id', component: ContactosViewComponent },
    { path: ':id/edit', component: ContactosEditComponent },
    { path: ':id/:kk', component: ContactosViewComponent },
   ] },

  { path: 'config', loadChildren: () => import('./config/config.module').then(mod => mod.ConfigModule)},
  { path: '404.html', component: PageNotFoundComponent },
  { path: '**', component: PageNotFoundComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],

})
export class AppRoutingModule { }


