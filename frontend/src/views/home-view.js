import { PolymerElement } from "@polymer/polymer/polymer-element.js";
import { html } from "@polymer/polymer/lib/utils/html-tag.js";
import "@vaadin/vaadin-button/vaadin-button.js";
import "@vaadin/vaadin-ordered-layout/vaadin-vertical-layout.js";
import "@vaadin/vaadin-text-field/vaadin-text-field.js";

class HomeView extends PolymerElement {
  static get template() {
    return html`
      <vaadin-vertical-layout>
        <vaadin-text-field
          id="email"
          label="Email (login)"
          colspan="2"
        ></vaadin-text-field>
        <vaadin-text-field
          id="first-name"
          label="First Name"
        ></vaadin-text-field>
        <vaadin-text-field id="last-name" label="Last Name"></vaadin-text-field>
        <vaadin-text-field
          id="no-java-field"
          label="No Java Field"
        ></vaadin-text-field>
        <vaadin-button id="ok" theme="raised primary">OK</vaadin-button>
        <vaadin-button id="cancel" theme="raised">Cancel</vaadin-button>
      </vaadin-vertical-layout>
    `;
  }
  static get is() {
    return "home-view";
  }
}

customElements.define(HomeView.is, HomeView);
