import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import {FontSizeEditorComponent} from './font-size-editor/font-size-editor.component';
import { PetComponent } from './pet/pet.component';
import { CaculatorComponent } from './caculator/caculator.component';
import { ColorPickerComponent } from './color-picker/color-picker.component';
import { NameCartComponent } from './name-cart/name-cart.component';
import { ProgressBarComponent } from './progress-bar/progress-bar.component';
import { RatingBarComponent } from './rating-bar/rating-bar.component';
import { CountdownComponent } from './countdown/countdown.component';
import { TodoComponent } from './todo/todo.component';
import {ReactiveFormsModule} from '@angular/forms';
import { RegisterFinalComponent } from './register-final/register-final.component';
import { RegisterComponent } from './register/register.component';
import { Todo2Component } from './todo2/todo2.component';
import { LoginComponent } from './login/login.component';
import { TimelinesComponent } from './timelines/timelines.component';
import { AppRoutingModule} from './app-routing.module';
import { YoutubePlaylistComponent } from './youtube-playlist/youtube-playlist.component';
import { YoutubePlayerComponent } from './youtube-player/youtube-player.component';
import { DemoComponent } from './demo/demo.component';


@NgModule({
    declarations: [
        AppComponent,
        FontSizeEditorComponent,
        PetComponent,
        CaculatorComponent,
        ColorPickerComponent,
        NameCartComponent,
        ProgressBarComponent,
        RatingBarComponent,
        CountdownComponent,
        TodoComponent,
        RegisterFinalComponent,
        RegisterComponent,
        Todo2Component,
        LoginComponent,
        TimelinesComponent,
        YoutubePlaylistComponent,
        YoutubePlayerComponent,
        DemoComponent,
    ],
    imports: [
        BrowserModule,
        ReactiveFormsModule,
         AppRoutingModule,
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
