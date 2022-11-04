//
//  ContentView.swift
//  zseit
//
//  Created by Maciej Monkiewicz on 04/11/2022.
//

import SwiftUI
import AVFoundation

struct ContentView: View {
    var body: some View {
        VStack {
            Button("Odpal Latarkę") {
                /*@START_MENU_TOKEN@*//*@PLACEHOLDER=Action@*/ /*@END_MENU_TOKEN@*/
            }
            Label("Stopnie Celcjusza", systemImage: "9.circle")
            
            Label("Stopnie Fahreneita", systemImage: "48.circle")
            Label("Spalanie wynosi 6,7 litra.", systemImage: "fuelpump")
            Label("Koszt paliwa wyniesie około 53.6zł", systemImage: "fuelpump")


                    }
        
    }

        
    }


struct MyNewPrimitiveButtonStyle: PrimitiveButtonStyle {
    var color: Color

    func makeBody(configuration: PrimitiveButtonStyle.Configuration) -> some View {
        MyButton(configuration: configuration, color: color)
    }
   
    struct MyButton: View {
        @State private var pressed = false

        let configuration: PrimitiveButtonStyle.Configuration
        let color: Color

        var body: some View {

            return configuration.label
                .foregroundColor(.white)
                .padding(15)
                .background(RoundedRectangle(cornerRadius: 5).fill(color))
                .compositingGroup()
                .shadow(color: .black, radius: 3)
                .opacity(self.pressed ? 0.5 : 1.0)
                .scaleEffect(self.pressed ? 0.8 : 1.0)
                .onLongPressGesture(minimumDuration: 2.5, maximumDistance: .infinity, pressing: { pressing in
                withAnimation(.easeInOut(duration: 1.0)) {
                    self.pressed = pressing
                }
                if pressing {
                    print("My long pressed starts")
                    print("     I can initiate any action on start")
                } else {
                    print("My long pressed ends")
                    print("     I can initiate any action on end")
                }
            }, perform: { })
        }
    }
}



struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}


// function to turn on flashlight


