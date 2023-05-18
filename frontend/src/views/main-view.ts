import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/button/src/vaadin-button.js';
import '@vaadin/password-field/src/vaadin-password-field.js';
import '@vaadin/text-field/src/vaadin-text-field.js';

@customElement('main-view')
export class MainView extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
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
}