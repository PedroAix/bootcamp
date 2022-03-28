import {
  Component,
  Input,
  OnChanges,
  OnInit,
  SimpleChanges,
} from '@angular/core';

@Component({
  selector: 'app-show-errors-messages',
  templateUrl: './show-errors-messages.component.html',
  styleUrls: ['./show-errors-messages.component.css'],
})
export class ShowErrorsMessagesComponent implements OnChanges {
  @Input() errors: any;
  mensaje: string = '';
  invisible: boolean = true;

  constructor() {}
  ngOnChanges(changes: SimpleChanges): void {
    this.mensaje = '';
    if (this.errors)
      for (let prop in this.errors) {
        switch (prop) {
          case 'required':
            this.mensaje += 'Es obligatorio.';
            break;
          case 'maxlength':
            this.mensaje += `Puede tener un máximo de ${this.errors['maxlength'].requiredLength} caracteres`;
            break;
          case 'minlength':
            this.mensaje += `Puede tener un mínimo de ${this.errors['minlength'].requiredLength} caracteres`;
            break;
          case 'type':
            this.mensaje += 'Tipo no válido';
            break;
          case 'email':
            this.mensaje += 'Email no válido';
            break;
        }
      }
    this.invisible = this.mensaje == '';
  }
}
