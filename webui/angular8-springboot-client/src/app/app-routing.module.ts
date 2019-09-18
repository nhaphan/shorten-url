import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UserDetailsComponent} from './user-details/user-details.component';
import { CreateUserComponent} from './create-user/create-user.component';
import { UserListComponent} from './user-list/user-list.component';
import {UrlsComponent} from './urls/urls.component';

const routes: Routes = [
  {path: '', redirectTo: '/urls', pathMatch: 'full'},
  {path: 'users', component: UserListComponent},
  {path: 'add', component: CreateUserComponent},
  {path: 'details/:id', component: UserDetailsComponent},
  {path: 'urls', component: UrlsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
