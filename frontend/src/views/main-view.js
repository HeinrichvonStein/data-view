var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/button/src/vaadin-button.js';
import '@vaadin/password-field/src/vaadin-password-field.js';
import '@vaadin/text-field/src/vaadin-text-field.js';
let MainView = class MainView extends LitElement {
    static get styles() {
        return css `
      :host {
          display: block;
          height: 100%;
      }
      `;
    }
    render() {
        return html `
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-text-field type="text" placeholder="Host IP ..." id="hostIP" style="margin-left: var(--lumo-space-xs);"></vaadin-text-field>
 <vaadin-text-field type="text" placeholder="Username ..." id="username" style="margin-left: var(--lumo-space-xs);"></vaadin-text-field>
 <vaadin-password-field style="margin-left: var(--lumo-space-xs);" type="password" placeholder="password" id="password"></vaadin-password-field>
 <vaadin-button theme="primary" tabindex="0" id="connectButton" style="margin-left: var(--lumo-space-xs);">
   Connect 
 </vaadin-button>
</vaadin-vertical-layout>
`;
    }
    // Remove this method to render the contents of this view inside Shadow DOM
    createRenderRoot() {
        return this;
    }
};
MainView = __decorate([
    customElement('main-view')
], MainView);
export { MainView };
//# sourceMappingURL=main-view.js.map