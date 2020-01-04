import { TestBed, async } from '@angular/core/testing';
import { FicusVirensApp } from './ficus-virens-app';

describe('FicusVirensApp', () => {
  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [
        FicusVirensApp
      ],
    }).compileComponents();
  }));

  it('should create the app', () => {
    const fixture = TestBed.createComponent(FicusVirensApp);
    const app = fixture.debugElement.componentInstance;
    expect(app).toBeTruthy();
  });

  it(`should have as title 'crown'`, () => {
    const fixture = TestBed.createComponent(FicusVirensApp);
    const app = fixture.debugElement.componentInstance;
    expect(app.title).toEqual('crown');
  });

  it('should render title in a h1 tag', () => {
    const fixture = TestBed.createComponent(FicusVirensApp);
    fixture.detectChanges();
    const compiled = fixture.debugElement.nativeElement;
    expect(compiled.querySelector('h1').textContent).toContain('Welcome to crown!');
  });
});
