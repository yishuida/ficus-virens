import { Component, OnInit } from '@angular/core';

export interface DocSection {
  name: string;
  summary: string;
}

const INDEX = 'index';
const TIME_LINE = 'time-line';
const ABOUT_ME = 'about-me';

const SECTIONS: {[key: string]: DocSection} = {
  [INDEX]: {
    name: '首页',
    summary: 'Vista Yih 的博客首页',
  },
  [TIME_LINE]: {
    name: '时间线',
    summary: '从时间的长河流过，留下的自己的足迹。',
  },
  [ABOUT_ME]: {
    name: '关于我',
    summary: '你不单是你，还是社会的投影。',
  }
};

const SECTIONS_KEYS = Object.keys(SECTIONS);


@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent {

  get sections() {
    return SECTIONS;
  }

  get sectionKeys() {
    return SECTIONS_KEYS;
  }
}
