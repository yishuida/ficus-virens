export class MessageModel {
  id: number;
  content: string;
  constructor(private id1: number, public message: string) {
    this.id = id1;
    this.content = message;
  }
}
